package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {
	
	int Y = 0;
	
	public void fillOnTheMap() throws FileNotFoundException {
	
		try {
			Scanner scanner = new Scanner(new File("1er_map.txt"));
			char Dimension[][] = new char [this.getHeight()][this.getWidth()];
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				for (int X=0; X<this.getWidth(); X++) {
					Dimension[Y][X] = line.charAt(X);
				}
				Y++;
			}
			scanner.close();
		}catch(Exception e) {
			e.getMessage().toString();
		}
	}	
	
	private int getHeight() { //longueur
		return 20;
	}

	private int getWidth() { //largeur
		return 12;
	}
}
