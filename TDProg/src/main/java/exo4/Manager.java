package exo4;


public class Manager extends Employe{
	private final int nbrAssistants;
	
	public int getNbrAssistants(){
		return this.nbrAssistants;
	}
	
	public Manager(String nom, String adresse, int ancienete, int nbrAssistants) {
		super(nom, adresse, ancienete);
		this.nbrAssistants = nbrAssistants;
	}

}
