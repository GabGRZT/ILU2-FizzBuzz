package ilu2;


public class Welcome {
	
	//Fonction qui renvoie le mot avec la premiere lettre en majuscule
	private static String giveUpperCase(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	
	private static StringBuilder setChaineMin (String input) {
		String [] noms = input.split(",");
		StringBuilder chaineMin = new StringBuilder("Hello");
		for(int i = 0; i<noms.length; i++) {
			noms[i] = noms[i].trim();
			if (!(noms[i].equals(noms[i].toUpperCase()))) {
				noms[i] = giveUpperCase(noms[i]);
				chaineMin.append(", "+noms[i]);
			}
		}
		return chaineMin;
	}
	
	private static StringBuilder setChaineMaj (String input) {
		String [] noms = input.split(",");
		StringBuilder chaineMaj = new StringBuilder(". AND HELLO");
		for(int i = 0; i<noms.length; i++) {
			noms[i] = noms[i].trim();
			if (noms[i].equals(noms[i].toUpperCase())) {
				noms[i] = giveUpperCase(noms[i]);
				chaineMaj.append(", "+noms[i]);
			}
		}
		if (!(chaineMaj.toString().equals(". AND HELLO"))) {
			chaineMaj.append(" !");
		}else {
			chaineMaj.setLength(0);
		}
		return chaineMaj;
	}
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("");
		
		if (input == null||input.trim().equals("")) return chaine.append("Hello, my friend").toString();
		
		if(input.equals(input.toUpperCase())) return chaine.append("HELLO, "+input).toString();
		
		String [] noms = input.split(",");
		if(noms.length > 1) {
			StringBuilder chaineMin = setChaineMin(input);
			StringBuilder chaineMaj = setChaineMaj(input);
			chaineMin.append(chaineMaj).toString();
			return chaineMin.toString();
		}
		
		input = giveUpperCase(input);
		return chaine.append("Hello "+input).toString();
		
	}
}
