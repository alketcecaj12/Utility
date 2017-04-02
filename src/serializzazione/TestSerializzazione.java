package serializzazione;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializzazione {
	
	
	public static void main (String [] args){
		
	//	GameCharacter onegc = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
		GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});
		// imagine code that does things with the characters that might change their state values
		try {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
//		os.writeObject(onegc);
		os.writeObject(two);
		os.writeObject(three);
		os.close();
		} catch(IOException ex) {
		ex.printStackTrace();
		}
	//	onegc = null; // cambio lo stato degli oggetti 
		two = null;
		three = null;
		
		// ripristino lo stato degli oggetti usando 
		try {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
		GameCharacter oneRestore = (GameCharacter) is.readObject();
		GameCharacter twoRestore = (GameCharacter) is.readObject();
		GameCharacter threeRestore = (GameCharacter) is.readObject();
		System.out.println("One�s type: " + oneRestore.getType());
		System.out.println("list of weapons: "+oneRestore.getWeapons());
		System.out.println("Two�s type: " + twoRestore.getType());
		System.out.println("Three�s type: " + threeRestore.getType());
		} catch(Exception ex) {
		ex.printStackTrace();
		}
		
       
		
		
	}
	
	
	
}
