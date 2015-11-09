package exo4;

public class Vendeur extends Employe{
	private final int commission;
	
	public Vendeur(String nom, String adresse, int ancienete, int commission) {
		super(nom, adresse, ancienete);
		this.commission = commission;
	}

	public double getCommission() {
		return this.commission;
	}

}