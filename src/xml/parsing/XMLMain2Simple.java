package xml.parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class XMLMain2Simple {

	public static void main (String[] args) throws Exception{
		
		String item = null;
		String link = null;
		String pubdate = null;
		String line ;
		BufferedReader br = new BufferedReader(new FileReader(new File("data/prova.xml")));
		
		while((line= br.readLine())!= null){
			
			//System.out.println(line);
	        
			if(line.startsWith("<title>")){
				  line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
				  item = line;
				  System.out.println(item);
			  }
			
			
			if(line.startsWith("<link>")){
				  line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
				  pubdate= line;
				  System.out.println(pubdate);
			  }
			if(line.startsWith("<pubDate>")){
				  line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
				  link= line;
				  System.out.println(link);
			  }
			
		}br.close();
		
		
	}
	
	
}
