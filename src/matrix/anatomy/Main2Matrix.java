package matrix.anatomy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import es.matrice.Matrix;

public class Main2Matrix {

	static ArrayList<Matrix> matrici = new ArrayList<Matrix>();
	
	public static void main (String [] args)throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("data/matrix.txt")));
		
		String line;
		
		Matrix n = null ;
		
		while((line=br.readLine())!=null){
			
			if(line.startsWith("*")) {	
				n = new Matrix(line.substring(1));// 
				matrici.add(n);
			}
			else {
				n.add(line);
			}	
			
		}
		br.close();

		System.out.println(matrici.size());
		
	  punto1();
	}

	
	public static void punto1() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("1.html"));
		for(Matrix n: matrici) {
			out.println(n.printHTML());
			
			String html = "<html><body><table>";
			for(int[] line: n.m) {
				html = html + "<tr>";
				for(int x: line)
					html = html + "<td>"+x+"</td>";
				html = html + "</tr>";
			}
			html = html+"</table></body></html>";
			out.println(html);
		}
		out.close();
	}
	
	
	
	
}
