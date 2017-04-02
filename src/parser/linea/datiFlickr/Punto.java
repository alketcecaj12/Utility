package parser.linea.datiFlickr;

public class Punto {

	double lat, lon;
	
	
	public Punto(double la, double lo){
		this.lat = la;
		this.lon = lo;
	}
	public String toString(){
		
		return ""+lat+","+lon;
	}
}
