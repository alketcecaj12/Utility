package test.methods;


	public class WeightedEdge  {
	 public int weight; // The weight on edge (u, v)
	public int u;
	public int v ;
	 /** Create a weighted edge on (u, v) */
	 public WeightedEdge(int u, int v, int weight) {
	 this.u = u;
	 this.v = v;
	 this.weight = weight;
	}
	
	/** Compare two edges on weights */
	 public int compareTo(WeightedEdge edge) {
 if (weight > edge.weight)
	 return 1;
	 else if (weight == edge.weight)
	 return 0;
	 else
	 return -1;
	}
	 }
	
	

