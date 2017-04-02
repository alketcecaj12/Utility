package parser.linea.datiFlickr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MainPunto {

public static void main (String [] args) throws Exception{
		
		ArrayList<Punto> arr_coord = new ArrayList<Punto>(); 
		
BufferedReader br = new BufferedReader(new FileReader(new File("data/australia.kml")));
		
		String line;
		double lat = 0;
		double lon = 0;
		double alt = 0;
	
	    while((line = br.readLine())!=null){
	    	line = line.trim();
	    	//System.out.println(line);
	    	
			if (line.startsWith("<coordinates>")){
				
			  String coord = br.readLine();
				
			  String[] sc = coord.split(" ");
				
		      for (int j =0; j < sc.length; j++){
				
			    String [] c = sc[j].split(",");
			   
			  	
					lat = Double.parseDouble(c[0]);
					//System.out.println(lat);
					
					lon = Double.parseDouble(c[1]);
					//System.out.println(lon);
	
					arr_coord.add(new Punto(lat, lon));		
				 
			     
			   }
		    }
	     }	
		
		br.close();	
		
		System.out.println(arr_coord);
		LineaPrinter.print("PrintAustralia.kml", arr_coord);
		}
	}
	

		

	

