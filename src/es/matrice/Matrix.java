package es.matrice;

import java.util.ArrayList;

public class Matrix {
	public String nome;
	public ArrayList<int[]> m;
	int[][] z;

	public Matrix(String nome) {
		this.nome = nome;
		m = new ArrayList<int[]>();
	}
	
	//1,2,3
	public void add(String line) {
		String[] s = line.split(","); // "1","2","3"
		int[] x = new int[s.length]; // 1,2,3
		for(int i=0; i<s.length;i++)
			x[i] = Integer.parseInt(s[i]);
		m.add(x);
	} 
	
	public void print() {
		System.out.println(nome+" = "+m.size()+","+m.get(0).length);
	}
	
	public void createArray() {
		z = new int[m.size()][m.get(0).length];
		for(int i=0; i<m.size();i++) 
		for(int j=0; j<m.get(0).length;j++)
			z[i][j] = m.get(i)[j];
	}
	
	public String printHTML() {
		String html = "<html><body><table>";
		for(int[] line: m) {
			html = html + "<tr>";
			for(int x: line)
				html = html + "<td>"+x+"</td>";
			html = html + "</tr>";
		}
		html = html+"</table></body></html>";
		return html;
	}
	
	public boolean oksize(Matrix x) {
		if(m.size() == x.m.size() && m.get(0).length == x.m.get(0).length)
			return true;
		return false;
	}
	
	
	public boolean diagInvertibile() {
		boolean diag = true;
		for(int i=0; i<m.size();i++) 
		for(int j=0; j<m.get(0).length;j++) {
			if(i != j && m.get(i)[j] != 0)
				diag = false;
			if(i == j && m.get(i)[j] == 0)
				diag = false;
		}
		return diag;
	} 
	
	
	
	
}
