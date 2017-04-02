package getsetmethods;

public class GetSetMethods {

	public static void main (String [] args){
		
		
		Libro l = new Libro();
		
		l.setAutore("Alket cecaj");
		l.setTitolo("java book");
		l.setPag(200);
		
		System.out.println(l.getAutore());
	}
	
	
}
