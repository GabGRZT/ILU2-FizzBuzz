package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("");
		

		if (input == null||input.trim().equals("")) return chaine.append("Hello, my friend").toString();
		if(input.equals(input.toUpperCase())) return chaine.append("HELLO, "+input).toString();
		
		String [] noms = input.split(",");
		if(noms.length > 1) {
			noms[0] = noms[0].substring(0,1).toUpperCase() + noms[0].substring(1);
			chaine.append("Hello, "+noms[0]);
			for(int i = 1; i<noms.length; i++) {
				noms[i] = noms[i].trim();
				noms[i] = noms[i].substring(0,1).toUpperCase() + noms[i].substring(1);
				chaine.append(", "+noms[i]);
			}
			return chaine.toString();
		}
			
		input = input.substring(0,1).toUpperCase() + input.substring(1);
		return chaine.append("Hello "+input).toString();
		
	}
}
