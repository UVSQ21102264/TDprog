package Exo5;

public class Direction {
	private char dir;
	
	public void setDir(char direction){
		/*if(direction != 'N'|| direction != 'S' || direction != 'W' || direction != 'E') {
			throw new IllegalArgumentException();
		}
		else*/ this.dir = direction;
	}
	
	public char getDir() {return this.dir;}

}
