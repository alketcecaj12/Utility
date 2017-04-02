package getsetmethods;

public class Libro {

	String titolo;
	String autore;
	int pag;
	
	public Libro(){};
	
	public Libro(String titolo, String autore, int pag){
		
		this.setTitolo(titolo);
		setAutore(autore);
		setPag(pag);
		
	}
	public void setTitolo(String tit){
		this.titolo = tit;
	}
	
	public void setAutore(String aut){
		this.autore = aut;
	}
	public void setPag(int pag){
		this.pag = pag;
	}
	public String getTitolo(){
		return titolo;
	}
	public String getAutore(){
		return autore;
	}
	public int getPag(){
		return pag;
	}	
}
