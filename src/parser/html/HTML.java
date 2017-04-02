package parser.html;

public class HTML {
	String paragrafo;
	String link;
	
	public HTML( String p, String l){
		
		this.paragrafo = p;
		this.link = l;
	}
	
	
	public String toString(){
		return paragrafo+","+link;
		
	}
	
}
