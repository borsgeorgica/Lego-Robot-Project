import ShefRobot.*;


public class Dot {
	
	private ColorSensor.Color colour;
	private int x,y;
	private boolean found = false;
	
	public Dot(ColorSensor.Color colour, int x, int y) {
		found = true;
		this.colour = colour;
		this.x = x;
		this.y = y;
		
	}
	
	
	
}
