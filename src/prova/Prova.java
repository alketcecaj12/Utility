package prova;

import java.util.ArrayList;

public class Prova {

	
	
	public static int []ordina (int a, int b , int c){
		
		int temp;
		
		 if(b > c){
			temp=c;
		    c=b;
		    b=temp;
		}
		if (a > b){
			temp=b;
		    b=a;
		    a=temp;
		
		}
		
		else if(a > c){
			temp=c;
		    c=a;
		    a=temp;
		}
		int[] arr = new int[3];
	for(int i =0; i<=arr.length; i++ ){
		arr[i]= a;
		
	}
		return arr;
	}
	
	public static void main (String [] args){
		String []COLORS = new String[] {"blue","rosso","verde","giallo","nero"};

		for (int c = 0; c < COLORS.length; c++){
			
		    System.out.println("<color>"+COLORS[c]+"</color>");
		   
		    }	
		int temp;
		int a =10; 
		int b = 20; 
		int c = 30;
		//temp =b;
		//b=c;
		//c=temp;
		// c=b;
		// b=c;
		//System.out.println(" b = "+b);
		//System.out.println(" c = "+c);
		
		ordina(7,1,2);
		
	}
	
}
