package es.matrice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Matrix> matrici = new ArrayList<Matrix>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("data/dati.txt"));
		String line;
		
		Matrix m = null;
		while((line = br.readLine())!=null) {
			if(line.startsWith("*")) {	
				m = new Matrix(line.substring(1));
				matrici.add(m);
			}
			else {
				m.add(line);
			}
		}
		punto1();
		punto2();
		punto3();
		//punto4();
		punto5();
		punto6();
		punto7();
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
	
	public static void punto2() throws Exception {
		Matrix a=null, b=null, c=null;
		for(Matrix n: matrici) {
			if(n.nome.equals("A"))
				a = n;
			if(n.nome.equals("B"))
				b = n;
			if(n.nome.equals("C"))
				c = n;
		}
		
		if(a == null || b == null || c == null) {
			System.out.println("Non ci sono le matrici");
		}
		
		if(a.oksize(b) && a.oksize(c)) {
			int[][] operazione = new int[a.m.size()][a.m.get(0).length];
			for(int i=0; i<operazione.length;i++)
		    for(int j=0; j<operazione[i].length;j++)
		    	operazione[i][j] = a.m.get(i)[j] + b.m.get(i)[j]- c.m.get(i)[j];
		
		
			PrintWriter out = new PrintWriter(new FileWriter("2.html"));
			String html = "<html><body><table>";
			for(int[] line: operazione) {
				html = html + "<tr>";
				for(int x: line)
					html = html + "<td>"+x+"</td>";
				html = html + "</tr>";
			}
			html = html+"</table></body></html>";
			out.println(html);
			out.close();
		}
		else
			System.out.println("Matrici non hanno dim compatibile");
	}
	
	
	public static void punto3() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("3.html"));
		

		for(Matrix n: matrici) {
			
			int[][] trasposta = new int[n.m.get(0).length][n.m.size()];
			for(int i=0; i<trasposta.length;i++)
			for(int j=0; j<trasposta[0].length;j++)
				trasposta[i][j] = n.m.get(j)[i];
			
			
			String html = "<html><body><table>";
			for(int i=0; i<trasposta.length;i++) {
				html = html + "<tr>";
				for(int x: trasposta[i])
					html = html + "<td>"+x+"</td>";
				html = html + "</tr>";
			}
			html = html+"</table></body></html>";
			out.println(html);
		}
		out.close();
	}
	
	
	public static void punto4() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("4.html"));
		

		for(Matrix n: matrici) {
			
			int[][] trasposta = new int[n.m.get(0).length][n.m.size()];
			for(int i=0; i<trasposta.length;i++)
			for(int j=0; j<trasposta[0].length;j++)
				trasposta[i][j] = n.m.get(j)[i];
			
			
			boolean sim = true;
			for(int i=0; i<trasposta.length;i++)
			for(int j=0; j<trasposta[0].length;j++)
					if(trasposta[i][j] != n.m.get(i)[j])
						sim = false;
			
			if(sim) {
				String html = "<html><body><table>";
				for(int i=0; i<trasposta.length;i++) {
					html = html + "<tr>";
					for(int x: trasposta[i])
						html = html + "<td>"+x+"</td>";
					html = html + "</tr>";
				}
				html = html+"</table></body></html>";
				out.println(html);
			}
		}
		out.close();
	}
	
	public static void punto5() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("5.html"));
		out.println("<html><body>");
		for(Matrix n: matrici) {
			
			double avg = 0;
			for(int[] line: n.m) 
				for(int x: line)
					avg = avg + x;
			
			avg = avg / (n.m.size() * n.m.get(0).length);
			
			out.println(avg+"<br>");
		}
		out.println("</body></html>");
		out.close();
	}
	
	
	public static void punto6() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("6.html"));
		out.println("<html><body>");
		double max = 0;
		double min = Double.MAX_VALUE;
		Matrix mmax = null;
		Matrix mmin = null;
		for(Matrix n: matrici) {
			
			double somma = 0;
			for(int[] line: n.m) 
				for(int x: line)
					somma = somma + x;
			
			if(somma > max) {
				max = somma;
				mmax = n;
			}
			if(somma < min) {
				min = somma;
				mmin = n;
			}
			
			
		}
		out.println("MASSIMO = "+mmax.nome+"<br>");
		out.println("MINIMO = "+mmin.nome);
		out.println("</body></html>");
		out.close();
	}
	
	public static void punto7() throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("7.html"));
		String html = "<html><body>";
		for(Matrix n: matrici) {
			if(n.diagInvertibile()) {
				double[][] inversa = new double[n.m.get(0).length][n.m.size()];
				for(int i=0; i<inversa.length;i++)
				for(int j=0; j<inversa[0].length;j++)
					if(i==j) {
					inversa[i][j] = 1.0/n.m.get(i)[j];
				}
				
				html += "<table>";
				for(int i=0; i<inversa.length;i++) {
					html = html + "<tr>";
					for(double x: inversa[i])
						html = html + "<td>"+x+"</td>";
					html = html + "</tr>";
				}
				html = html+"</table>";
				out.println(html);
	
				
			}
			
			
			
			
		}
		out.close();
		
	}
	
} 
