package parse.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
	
	
	public static void main(String[] args) throws Exception{
		
		ArrayList<String> arrlst = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader(new File("data/test.txt")));
		String uno = "" ;
		String due = "" ;
		String tre = "" ;
		String line;
		int i=0;
		while((line = br.readLine())!=null){
			
			String [] stringa = line.split(" ");
			
          	for(String s : stringa){
				
				System.out.println(s);	
					String [] stringa2 = s.split(",");
				
					for(String s2 : stringa2){
					System.out.println(s2);		
				uno = stringa2[0];
				due = stringa2[1];
				tre = stringa2[2];
				}
	     arrlst.add(uno);
	     arrlst.add(due);
	     arrlst.add(tre);
          	}
		}
			System.out.println(arrlst);
		
	     WriteFile wf = new WriteFile();
	     wf.print(arrlst, "testoscritto2.txt");
	   }
		
	}


