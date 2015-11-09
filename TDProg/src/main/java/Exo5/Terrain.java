package Exo5;

import java.util.ArrayList;

public class Terrain {
	private int length;
	private int width;
	ArrayList<Robot> listRobot = new ArrayList<Robot>();
	
	/**
	 * constructeur a completer
	 */
	public Terrain() {};
	
	public void avancerTous() {
		for(int i =0; i<listRobot.size();i++) {
			listRobot.get(i).avance();
		}
	}
}
