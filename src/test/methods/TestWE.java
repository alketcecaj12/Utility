package test.methods;

public class TestWE {

	public static void main (String [] args){
		
		WeightedEdge we = new WeightedEdge(1,2,7);
		WeightedEdge we1 = new WeightedEdge(1,2,7);
		
		System.out.println(we1.compareTo(we));
		
		
	}
	
	
}
