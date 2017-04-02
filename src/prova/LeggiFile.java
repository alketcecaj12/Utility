package prova;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LeggiFile {

	static ArrayList <String> arr = new ArrayList<String>();
	public static void main (String [] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("data/leggi.txt")));
		String line;
		while((line = br.readLine())!=null){
			
			String [] s = line.split(" ");
			for (int i =0; i < s.length; i++){
				
				arr.add(s[i]);
			}
			
			for(int j = 0; j < 3; j++){
				String [] s2 = arr.get(j).split(",");
				
				
				arr.add(s2[j]);
			}
		}
		
		br.close();
	
		for (int i =0; i< arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}
	
}
