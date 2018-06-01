package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Observable;
import java.util.Scanner;

import Element.IElement;

public class Map extends Observable implements IMap {
	
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

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
}
