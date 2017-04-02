package parser.partenza;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KMLShapeParser {
	
	public static HashMap<Integer, SubPref> parse(String file) throws Exception {
		HashMap<Integer, SubPref> map = new HashMap<Integer, SubPref>();
			
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		String line;
		boolean inPlacemark = false;
		boolean inRegion = false;
		
		String name = null;
		int id = -1;
		double lat = -1;
		double lon = -1;
		List<double[]> region_coordinates = null;
		
		while((line = br.readLine())!=null) {
			line = line.trim();
			
			if(line.equals("<Placemark id=\"\">")) {
				name = null;
				id = -1;
				lat = -1;
				lon = -1;
				inPlacemark = true;
			}
			
			
			if(inPlacemark) {
				if(line.startsWith("<Snippet maxLines=\"1\">")) {
					name = line.substring(line.indexOf(">")+1, line.indexOf("</"));
					//System.out.println(name);
				}
				if(line.startsWith("<name>")) {
					String sid = line.substring(line.indexOf(">")+1, line.indexOf("</"));
					id = Integer.parseInt(sid);
					//System.out.println(id);
				}
				if(line.startsWith("<coordinates>")) {
					String coord = line.substring(line.indexOf(">")+1, line.indexOf(",0 </"));
					String[] sc = coord.split(",");
					lat = Double.parseDouble(sc[0]);
					lon = Double.parseDouble(sc[1]);
					//System.out.println(lat+","+lon);
				}
			}
			
			if(inPlacemark && line.equals("</Placemark>")) { 
				SubPref sp = new SubPref(id,name,lat,lon);
				map.put(id, sp);
				inPlacemark = false;
			}
			
			
			if(!line.equals("<Placemark id=\"\">") && line.startsWith("<Placemark id=")) {
				inRegion = true;
			}
			
			
			if(inRegion) {
				if(line.startsWith("<name>")) {
					String sid = line.substring(line.indexOf(">")+1, line.indexOf("</"));
					id = Integer.parseInt(sid);
					//System.out.println(id);
				}
				if(line.startsWith("<coordinates>")) {
					region_coordinates = new ArrayList<double[]>();
					String coord = line.substring(line.indexOf(">")+1, line.indexOf(" </"));
					String[] sc = coord.split(" ");
					for(String p: sc) {
						String[] pxy = p.split(",");
						lat = Double.parseDouble(pxy[0]);
						lon = Double.parseDouble(pxy[1]);
						region_coordinates.add(new double[]{lat,lon});
					}
				}
			}
			
			if(inRegion && line.equals("</Placemark>")) {
				map.get(id).region = region_coordinates;
				inRegion = false;
			}		
			
		}
		
		br.close();
		return map;
	}
}
