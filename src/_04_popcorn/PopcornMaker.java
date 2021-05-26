package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	
	
	public static void main(String[] args) {
	
		Microwave yes= new Microwave();
		String flavor= JOptionPane.showInputDialog("What flavor do you want the popcorn to be?");
		Popcorn butter= new Popcorn(flavor);
		yes.putInMicrowave(butter);

		
		String cookTime = JOptionPane.showInputDialog("How many minutes do you want the popcorn to cook for?");
		int cookTimeInMinutes = Integer.parseInt(cookTime);
		yes.setTime(cookTimeInMinutes);
		yes.startMicrowave();
	
		}
	
	}
