package effectivejava;

public class Main2VettObj {

	public static void main (String[] args){
		
		VettoreObj[] vt = new VettoreObj[3];
		
		
		VettoreObj vt0 = new VettoreObj("Alket");
		VettoreObj vt1 = new VettoreObj("Alban");
		VettoreObj vt2 = new VettoreObj("Erion");
		
		
		VettoreObj.add2vect(0, vt0, vt);
		VettoreObj.add2vect(1, vt1, vt);
		VettoreObj.add2vect(2, vt2, vt);
		
		for (int i = 0; i < vt.length; i++) {
			System.out.println(vt[i].nome);
			
		}
	}
	
	
}
