package xml.parsing;

public class XML {
	
	String item;
	String title;
	String description;
	String link;
	String pubdate;
	
	
	public XML( String t, String l, String p){
		
		this.title = t;
		this.link = l;
		this.pubdate = p;
	}

	public String toString(){
		return "questo è l'item: "+item+"\n "+title+"\n "+description+"\n "+link+"\n "+pubdate;
	}
	
}
