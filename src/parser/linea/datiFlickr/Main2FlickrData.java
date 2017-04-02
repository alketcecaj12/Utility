package parser.linea.datiFlickr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main2FlickrData {

      public static void main (String [] args) throws Exception{
		
		ArrayList<Punto> arr_coord = new ArrayList<Punto>(); 
		
        BufferedReader br = new BufferedReader(new FileReader(new File("data/output_155 pic 10-05.csv")));
		
		String line;
		double lat = 0;
		double lon = 0;
	
	
	    while((line = br.readLine())!=null){
	
        	String []riga = line.split("\t");
        	lat = Double.parseDouble(riga[3]);
        	lon = Double.parseDouble(riga[4]);
        	arr_coord.add(new Punto(lat, lon));
	
        }
	   System.out.println(arr_coord);
	   PrintLineaFlickrData.print("printDataFlickr.kml", arr_coord); 
	   //LineaPrinter.print("printFlickrdata.kml", arr_coord);
     } 
}
