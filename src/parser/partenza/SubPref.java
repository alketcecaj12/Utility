package parser.partenza;
import java.util.ArrayList;
import java.util.List;


public class SubPref {
	public int id;
	public String name;
	public double lat;
	public double lon;
	public List<double[]> region;
	public double val = 0;
	
	public SubPref(int id, String name, double lat, double lon) {
		this.id = id;
		this.name = name;
		this.lat = lat;
		this.lon = lon;
	}
	
	
	public String getKMLRegionCoord() {
		StringBuffer sb = new StringBuffer();
		for(double[] xy: region) {
			sb.append(xy[0]+","+xy[1]+",0 ");
		}
		return sb.toString();
	}
	
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		for(double[] xy: region) {
			sb.append("("+xy[0]+","+xy[1]+")");
		}
		
		return id+": "+name+" ("+lat+","+lon+")\n"+sb.toString();
	}
}
