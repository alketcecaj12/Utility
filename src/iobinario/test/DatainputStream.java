package iobinario.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
	
	public class DatainputStream {
	 public static void main(String[] args) throws IOException {
	 // Create an output stream for file temp.dat
	
		 DataOutputStream output =  new DataOutputStream(new FileOutputStream("data/temp.dat"));
	
	 // Write student test scores to the file
	try{
		output.writeDouble(4.5);
		output.writeDouble(43.25);
		 output.writeDouble(3.2);
		 output.writeBytes("ciao");
		 output.close();
	System.out.println("all data writen");
	 // Close output stream
	 output.close();
	
	 // Create an input stream for file temp.dat
	
	 DataInputStream input = new DataInputStream(new FileInputStream("data/temp.dat"));
	 //System.out.println(" reading data : "+input.readByte());
	 while(true){
	System.out.println(" reading data : "+input.readDouble() );

	
	
	 }
	
	}catch (EOFException ex ){
		System.out.println("All data read");
	}
	}
	 
}
