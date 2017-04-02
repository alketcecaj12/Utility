package xml.parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MainXML {

	public static void main(String[] args )throws Exception{
		Map<String , XML> map = new HashMap<String, XML>();
	
		BufferedReader br = new BufferedReader(new FileReader(new File("data/europe.xml")));
	
	String line;
	String item = null;
	String title = null;
	String description = null;
	String link = null;
	String pubdate = null;
	boolean inItem = false;
	while((line= br.readLine())!=null){
		
		if(line.equals("<item>"))
		inItem= true;
		
		if(inItem){
		  if(line.startsWith("<title>")){
			  line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
			  item = line;
			  System.out.println(item);
		  }
		
		/*  if(line.startsWith("<link>")){
				line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
				link = line;
				  System.out.println(link);
		  }
				
		  if(line.startsWith("<pubdate>")){
			line = line.substring(line.indexOf(">")+1, line.indexOf("</"));
		    pubdate = line;
		    System.out.println(pubdate);
		  }
		  
		  }
		  */
		if(inItem && line.equals("</item>")){
			
			XML xml = new XML(title, link, pubdate);
            map.put(item, xml);
            inItem= false;
		}
		  
		  
		
	    } 
	    
	    for(XML x: map.values()){
			  System.out.println(x.toString());
		  }  
	 } br.close(); 
	}
}
  

