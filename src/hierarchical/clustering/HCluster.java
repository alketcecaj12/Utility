package hierarchical.clustering;

import java.util.ArrayList;
import java.util.List;

public class HCluster {

	int livello = 0;
	Cluster cl = new Cluster(2);
	List<Cluster> c = null;
 
	public HCluster(int l, Cluster cla){
	
		this.livello = l;
		c = new ArrayList<Cluster>();
	}
	
	public String toString(){
		return "";
	}
	
}
