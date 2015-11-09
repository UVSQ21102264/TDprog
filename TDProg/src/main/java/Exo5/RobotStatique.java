package Exo5;

public class RobotStatique extends Robot{
	
	public RobotStatique(){super();}
	
	@Override
	public void avance() { 
		System.out.println("[" + position.getX() + "][" + position.getY() + "] reste statique ");
		/*throw new UnsupportedOperationException();*/ }
}
