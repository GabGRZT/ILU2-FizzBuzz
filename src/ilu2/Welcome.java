package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("Hello, ");
		if (input == null||input.trim().equals("")) return chaine.append("my friend").toString();
		input = input.substring(0,1).toUpperCase() + input.substring(1);
		return chaine.append(input).toString();
		
	}
}
