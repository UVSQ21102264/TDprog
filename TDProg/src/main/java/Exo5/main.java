package Exo5;

public class main {

	public static void main(String[] args) {
		Terrain t = new Terrain();
		
		Robot r1 = new Robot();
		RobotStatique r2 = new RobotStatique();
		Robot r3 = new Robot();
		
		t.listRobot.add(r1);
		t.listRobot.add(r2);
		t.listRobot.add(r3);
		
		t.avancerTous();

	}

}
