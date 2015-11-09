package Exo5;

public class Robot {
	protected Position position;
	protected Direction direction;
	
	public Robot() {
		position = new Position();
		direction = new Direction();
		position.setX(0);
		position.setY(0);
		direction.setDir('N');
	}
	
	public void tourne() {/* tourne d'1/4 de tour*/}
	public void avance() {
		System.out.println("[" +position.getX() + "][" + position.getY() + "] avance vers " + direction.getDir());
		/* a faire : déplacement*/
	}
}
