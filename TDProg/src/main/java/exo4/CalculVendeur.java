package exo4;


public class CalculVendeur extends Calcul{
	public double calculSalaire(Vendeur v){
		return super.calculSalaire(v) + v.getCommission();
	}

}

