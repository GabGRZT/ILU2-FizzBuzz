package ilu2;

public class Welcome {
	
	//Fonction qui renvoie le mot avec la premiere lettre en majuscule
	private static String giveUpperCase(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("");
		if (input == null||input.trim().equals("")) return chaine.append("Hello, my friend").toString();
		
		if(input.equals(input.toUpperCase())) return chaine.append("HELLO, "+input).toString();
		
		String [] noms = input.split(",");
		StringBuilder response = new StringBuilder("");
		if(noms.length > 1) {
			chaine.append("Hello, "+giveUpperCase(noms[0]));
			for(int i = 1; i<noms.length; i++) {
				if (!(noms[i].equals(noms[i].toUpperCase()))) {
					noms[i] = giveUpperCase(noms[i].trim());
					chaine.append(", "+noms[i]);
				}else {
					response.append(". AND HELLO,");
					response.append(noms[i].toUpperCase()+" !");
				}	
			}
			return chaine.append(response).toString();
		}
		input = giveUpperCase(input);
		return chaine.append("Hello "+input).toString();
		
	}
}
