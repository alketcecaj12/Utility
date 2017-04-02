package effectivejava;

public class VettoreObj {

	String nome ;
	
	public VettoreObj(String n){
		this.nome = n;
	}
	
	public static void add2vect( int i ,VettoreObj vt, VettoreObj[] vett){
	
		vett[i]= new VettoreObj(vt.nome);	
	}
	
	public String toString(){
		return " il nome è : "+nome;
	}
	
}
