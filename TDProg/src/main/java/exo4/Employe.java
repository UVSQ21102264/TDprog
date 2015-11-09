package exo4;


public class Employe {
	private final String nom;
	private final String adresse;
	private final int salaire;
	private final int ancienete;
	
	public Employe(String nom, String adresse, int ancienete ){
		this.nom = nom;
		this.adresse = adresse;
		this.salaire = 1500;
		this.ancienete = ancienete;
	}
	// ...
	
	public int getSalaire(){
		return this.salaire;
	}
	
	public int getAncienete(){
		return this.ancienete;
	}
	
	public String getNom(){
		return this.nom;
	}
	public String getAdresse(){
		return this.adresse;
	}
}
