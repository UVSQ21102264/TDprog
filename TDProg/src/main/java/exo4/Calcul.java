package exo4;

public class Calcul {
	public double calculSalaire(Employe e){
		return e.getSalaire() + (e.getAncienete() * 20);
	}
	
}
