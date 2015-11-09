package exo4;


public class CalculManager extends Calcul{
	public double calculSalaire(Manager m){
		return super.calculSalaire(m) + (100 * m.getNbrAssistants());
	}
}
