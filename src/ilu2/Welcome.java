package ilu2;


public class Welcome {

	//Fonction qui renvoie le mot avec la premiere lettre en majuscule
	private static String giveUpperCase(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	
	//Fonction qui renvoie true si le mot entre en parametre est en majuscule sinon false
	private static boolean IsStringMaj(String nom) {
		return nom.equals(nom.toUpperCase());
	}
	
	private static String TwoNamesInput(String input) {
		String[] noms = input.split(",");
		StringBuilder chaine = new StringBuilder ("");
		return chaine.append("Hello, "+giveUpperCase(noms[0].trim())+", "+giveUpperCase(noms[1].trim())).toString();
	}
	
	//Fonction qui renvoie un tableau de String contenant les noms en minuscules.
	private static String[] tabLowerString(String input) {
		String[] noms = input.split(",");
		int nbNomsMin = 0;
		for (int i = 0; i< noms.length;i++) {
			if(!IsStringMaj(noms[i]))nbNomsMin++;
		}
		String[] lowercaseString = new String[nbNomsMin];
		int indicelowercaseString = 0;
		for (int i = 0; i < noms.length; i++) {
			if(!IsStringMaj(noms[i])) {
				lowercaseString[indicelowercaseString]=giveUpperCase(noms[i]).trim(); 
				indicelowercaseString++;
			}
		}
		return lowercaseString;
	}
	
	//Fonction qui renvoie un tableau de String contenant les noms en minuscules.
	private static String[] tabUpperString(String input) {
		String[] noms = input.split(",");
		int nbNomsMaj = 0;
		for (int i = 0; i< noms.length;i++) {
			if(IsStringMaj(noms[i])) nbNomsMaj++;
		}
		String[] uppercaseString = new String[nbNomsMaj];
		int indiceUppercaseString = 0;
		for (int i = 0; i < noms.length; i++) {
			if(IsStringMaj(noms[i])) {
				uppercaseString[indiceUppercaseString]=noms[i];
				indiceUppercaseString ++;
			}
		}
		return uppercaseString;
	}

	//Fonction qui renvoie la chaine avec tous les noms minuscules avec and.
	private static StringBuilder appendChaineLowercase(String input) {
		String[] nomsMin = tabLowerString(input);
		StringBuilder chaineMin = new StringBuilder("");
		if ( nomsMin.length == 1) {
			chaineMin.append(", "+giveUpperCase(nomsMin[0].trim()));
		}else if (nomsMin.length >= 2) {
			for (int i = 0; i < nomsMin.length-1; i++) {
				chaineMin.append(", "+giveUpperCase(nomsMin[i]).trim());
			}
			chaineMin.append(" and "+giveUpperCase(nomsMin[nomsMin.length-1]).trim());
		}
		return chaineMin;
	}
		
	//Fonction qui renvoie la chaine avec tous les noms majuscules avec and.
	private static StringBuilder appendChaineUppercase(String input) {
		String[] nomsMaj = tabUpperString(input);
		StringBuilder chaineMaj = new StringBuilder("");
		if ( nomsMaj.length == 1) {
			chaineMaj.append(", "+nomsMaj[0].trim()+" !");
		}else if (nomsMaj.length > 1) {
			for (int i = 0; i < nomsMaj.length-1; i++) {
				chaineMaj.append(", "+nomsMaj[i].trim());
			}
			chaineMaj.append(" AND "+nomsMaj[nomsMaj.length-1].trim()+" !");
		}
		return chaineMaj;

	}
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("");

		if (input == null||input.trim().equals("")) return chaine.append("Hello, my friend").toString();

		String [] noms = input.split(",");
		
		if(noms.length == 1 && !IsStringMaj(noms[0])) return chaine.append("Hello, "+giveUpperCase(noms[0])).toString();
		
		if(noms.length == 1 && IsStringMaj(noms[0])) return chaine.append("HELLO, "+input).toString();
		
		if (noms.length == 2 && !IsStringMaj(noms[0]) && !IsStringMaj(noms[1])) return TwoNamesInput(input) ;
				
		StringBuilder chaineMin = new StringBuilder("Hello");
		chaineMin.append(appendChaineLowercase(input));
		
		StringBuilder chaineMaj = new StringBuilder(". AND HELLO");
		chaineMaj.append(appendChaineUppercase(input));
		
		String[] tabMaj =tabUpperString(input);
		
		if (noms.length >= 3) {
			if(tabMaj.length > 0) return chaineMin.append(chaineMaj).toString();
		}
		return chaineMin.toString();
	}
}