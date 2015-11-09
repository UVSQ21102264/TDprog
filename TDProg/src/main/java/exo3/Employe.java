package exo3;

public class Employe {
	private final String nom;
	private final String adresse;
	
	public Employe(String nom, String adresse){
		this.nom = nom;
		this.adresse = adresse;
	}
	// ...
	
	public double calculSalaire(){
		return 0; /*methode de calcul du salaire*/
	}
	
	/* 4. on supprime cette methode d'affichage pour la remplacer par la classe AfficheEmploye
	 * 		et on ajout des getters
	public void afficheCoordonees(){
		System.out.println(nom + ", " + adresse);
	}*/
	public String getNom(){
		return this.nom;
	}
	public String getAdresse(){
		return this.adresse;
	}
	/* si la methode d'affichage change, il suffit de la modifier dans la classe d'affichage
	 * */
}
/* 1. la classe ne respect pas SRP car elle doit calculer le salaire et afficher les coordonnées
*  2. si la methode de calcul du salaire change, rien ne change dans la classe (sauf la methode)
*  3. si la methode d'affichage change, pas d'influence non plus, car l'affichage n'utilise pas
*  		le salaire.
*/