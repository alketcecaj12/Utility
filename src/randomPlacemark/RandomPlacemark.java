package randomPlacemark;

import java.io.FileWriter;
import java.io.PrintWriter;

public class RandomPlacemark {

	public static void main (String [] args) throws Exception{
		
		double c1 = (double) (Math.random() * 11);
		double c2 = (double) (Math.random() * 110);
		System.out.println(c1);
		System.out.println(c2);
		PrintWriter out = new PrintWriter(new FileWriter("data/randomplacemark.kml"));
		
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<kml xmlns=\"http://www.opengis.net/kml/2.2\">");
		out.println("<Placemark>");
		out.println("<name>Random Placemark</name>");
		out.println("<Point>");
		out.println("<coordinates>"+c1+","+c2+"</coordinates>");
		out.println("</Point>");
		out.println("</Placemark>");
		out.println("</kml>");
		out.close();
	}
	
	
	
}
