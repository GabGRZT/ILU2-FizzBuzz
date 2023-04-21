package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("Hello ");
		input = input.substring(0,1).toUpperCase() + input.substring(1);
		chaine.append(input);
		return chaine.toString();
	}
}
