package memento;
import java.lang.Math;
import java.util.Scanner;
public class GuessValue {

	public static void main(String[] args) {
		Scanner myChoice = new Scanner(System.in);
		String arvaus = "";
		Kilpailija Kalle = new Kilpailija();
		
		int value = 0;
		int maxValue = 9;
		int minValue = 1;	
		
		value = value +(int) (Math.random()* ((maxValue - minValue)+1)+minValue); //initialize the bullet
		
		
		Arvuuttaja arvuuttaja = new Arvuuttaja(value);
		Kalle.liityPeliin(arvuuttaja);
		System.out.println("Welcome to Guess the value:\n");
		System.out.println("The value is between " +minValue+" and " + maxValue);
		System.out.println("\n");
		
		String arvo = "";
		arvo= arvo +arvuuttaja.toString(); 
		//System.out.println("oikea vastaus: " + arvo);
	
		
		while (arvuuttaja.toString().contains(arvaus)) {
			System.out.print("insert your guess: "); 
			arvaus = arvaus+ myChoice.nextLine();
			
			if (arvaus.contains(arvuuttaja.toString())) {
				System.out.println("That is the right answer! Number : " + arvaus);
				break;
			}else {
				System.out.println("Wrong answer, try again!");
				System.out.println();
				arvaus ="";
			}
			
		}
		
		
		
	}
}
