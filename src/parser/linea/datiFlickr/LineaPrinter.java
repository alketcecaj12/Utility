package parser.linea.datiFlickr;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;



public class LineaPrinter {
	static final String [] COLORS = new String[] {"ff0000ff", "ff00ff00", "ffff0000", "ffffffff", "ff000000"};
	
	public static void print(String file, ArrayList<Punto> arr_coord) throws Exception {
		
		PrintWriter out = new PrintWriter(new FileWriter(new File(file)));
		int k = 0;
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<kml>");
		out.println("<Document>");
		for(int j =0; j < COLORS.length; j++){
			out.println("<Style id=\""+COLORS[j]+"\">");
			out.println("<LineStyle>");
		    
			out.println("<color>"+COLORS[j]+"</color>");
		   
			out.println("<width>2</width>");
			out.println("</LineStyle>");
			out.println("</Style>");
			}
		 for( int i = 0; i<arr_coord.size()-1; i++) {
		out.println("<Placemark>");
		out.println("<name>Percorso senza titolo</name>");
		
		// description
		out.println("<description>");
		out.println("&lt;h1&gt;Entity references are hard to type!&lt;/h1&gt;");
	    out.println("</description>");
		
		k++;
		if (k == 5){
			k=0;     // cosi non mi da ArrayIndexOutOfBounds
		}
		
		out.println("<styleUrl>#"+COLORS[k]+"</styleUrl>");
			
		out.println("<LineString>");
		out.println("<tessellate>1</tessellate>");
		out.println("<coordinates>");
		
		out.print(arr_coord.get(i).lat+","+arr_coord.get(i).lon+",0 ");
		out.print(arr_coord.get(i+1).lat+","+arr_coord.get(i+1).lon+",0 ");
		
		
		out.println("</coordinates>");
		out.println("</LineString>");
		out.println("</Placemark>");
		
	}
	
		out.println("</Document>");
		out.println("</kml>");
				
		out.close();	
	} 
}
