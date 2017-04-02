package parser.html;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class MainHTML {

	public static void main (String [] args) throws Exception{
		
		ArrayList <String> arr = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(new File("data/prova.xml")));
		String line ;
		
		while ((line = br.readLine())!= null){
			
			if (line.startsWith("<p>")){
				 line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
				String paragrafo = line;
				System.out.println(paragrafo);
				arr.add(paragrafo);
			
			}
			if (line.startsWith("<a href")){
				 line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
				String link = line;
				arr.add(link);
			
			}
			 
		}
		System.out.println(arr);
	}
	
}
