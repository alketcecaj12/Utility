package test.methods;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.*;
public class TestMap {

	public static void main (String [] args){
		
		
		Map<Integer, List<Double>>map2 = new HashMap<Integer, List<Double>>();
		
		List<Double> d = new ArrayList<Double>();
		
		d.add(5.0);
		d.add(3.0);
		d.add(7.0);
		
        List<Double> d2 = new ArrayList<Double>();
		
		d2.add(10.0);
		d2.add(6.0);
		d2.add(14.0);
		
		
		map2.put(1, d);
		map2.put(2, d2);
		
		for (int i = 1; i <= map2.size(); i++) {
			for (int j = 0; j < map2.get(i).size(); j++) {
				System.out.println(map2.get(i).get(j));	
		    }
		}
		
		
        Map<Integer, List<Double>>map3 = new HashMap<Integer, List<Double>>();
		
		List<Double> d3 = new ArrayList<Double>();
		
		d3.add(15.0);
		d3.add(9.0);
		d3.add(21.0);
		
        List<Double> d33 = new ArrayList<Double>();
		
		d33.add(30.0);
		d33.add(18.0);
		d33.add(42.0);
		
		
		map3.put(3, d3);
		map3.put(4, d33);
		
		
		
		
		Map<Integer, Map<Integer,List<Double>>>map = new HashMap<Integer, Map<Integer,List<Double>>>(); 
	
	    map.put(1, map2);
	    map.put(2, map3);
	    
	    for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
	    
	    
	    for (int i = 0; i <= map.size(); i++) {

          for (int j = 0; j <= map.get(i).size(); j++) {
			
        	  for (int j2 = 0; j2 < map.get(j).size(); j2++) {
					
        	    for (int k = 0; k <= map.get(j2).get(j).size(); k++) {
        		  
				  System.out.println(map.get(j).get(j2).get(k));
			    }
		  }
		}
	    }
	}
	
	
}
