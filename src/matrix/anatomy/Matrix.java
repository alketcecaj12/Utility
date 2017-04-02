package matrix.anatomy;

import java.util.ArrayList;

public class Matrix {

	public String nome;
	public ArrayList<int []> m;
	int [][] z ;
	
	public Matrix(String n){
		this.nome = n;
		m = new ArrayList<int[]>();
		
	}
	
	public void add(String line) {
		String[] s = line.split(","); // "1","2","3"
		int[] x = new int[s.length]; // 1,2,3
		for(int i=0; i<s.length;i++)
			x[i] = Integer.parseInt(s[i]);
		m.add(x);
	} 
	
	public String toString(){
		return nome;
	}
}
