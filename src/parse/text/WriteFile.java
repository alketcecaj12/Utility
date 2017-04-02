package parse.text;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteFile {

	public void print(ArrayList<String> arrlst, String file) throws Exception{
		
		PrintWriter out = new PrintWriter(new FileWriter(file));
		
		int count = 0;
		
		for(String s : arrlst){
			
			out.print(s+" ");
			
		}
		out.close();
	}
	
}
