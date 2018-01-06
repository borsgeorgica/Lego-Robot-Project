import ShefRobot.*;


public class Car {
	//Create a robot object to use and connect to it
    private Robot myRobot = new Robot();
       
    //The robot is made of components which are themselves objects.
    //Create references to them as useful shortcuts
    private Motor leftMotor = myRobot.getLargeMotor(Motor.Port.D);
    private Motor rightMotor = myRobot.getLargeMotor(Motor.Port.A);
    private Speaker speaker = myRobot.getSpeaker();
    private ColorSensor sensor = myRobot.getColorSensor(Sensor.Port.S1);
    private ColorSensor.Color currentColour;
        
        
	public Car() {
		
	}
	
	public void findBlackLine() {
		boolean lineFound  = false;
		while (!lineFound) {
        	leftMotor.setSpeed(100);
        	rightMotor.setSpeed(100);
        	leftMotor.forward();
        	rightMotor.forward();
        	
  
        	if(sensor.getColor() == ColorSensor.Color.BLACK) {
        		
        		leftMotor.stop();
        		rightMotor.stop();
        		speaker.playTone(1000, 500);
        		lineFound = true;
        		//this.followBlackLine();
        		/*
        		while(sensor.getColor()== ColorSensor.Color.BLACK) {
        			leftMotor.setSpeed(100);
        			leftMotor.backward();
        			myRobot.sleep(100);
        		}
        		
        		leftMotor.stop();
        		while(sensor.getColor()!= ColorSensor.Color.BLACK) {
        			leftMotor.setSpeed(100);
        			rightMotor.setSpeed(100);
        			leftMotor.forward();
        			rightMotor.forward();
        			myRobot.sleep(100);
        		}
        		*/
        		leftMotor.stop();
        		rightMotor.stop();	
        	}
        	else {
        		myRobot.sleep(100);
        	}
        	
        }
        
	}
	
	public void followBlackLine() {
		leftMotor.setSpeed(200);
        rightMotor.setSpeed(200);
        leftMotor.forward();
        rightMotor.forward();
        ColorSensor.Color currentColour;
        
        while(true) {
        	if(sensor.getColor() == ColorSensor.Color.BLACK) {
        	
        		rightMotor.stop();
        		leftMotor.forward();
        	}
 
        	else {
        		leftMotor.stop();
        		rightMotor.forward();
        	}
        
        	myRobot.sleep(50);
        	currentColour = sensor.getColor();
        	System.out.println(currentColour);
        	
        	if(sensor.getColor() == ColorSensor.Color.RED) {
        		followRedDot();
        		
        	}
        	
        	else if(sensor.getColor() == ColorSensor.Color.BLUE) {
        		followBlueDot();
        	}
        	/*
        	else if(sensor.getColor() == ColorSensor.Color.GREEN) {
        		followGreenDot();
        	}
        	else if(sensor.getColor() == ColorSensor.Color.YELLOW) {
        		followYellowDot();
        	}
        	
        	*/
        	
        	
        }
        
	}
	
	public void followRedDot() {
		leftMotor.setSpeed(100);
        rightMotor.setSpeed(100);
        leftMotor.forward();
        rightMotor.forward();
        
        while(true) {
        	if(sensor.getColor() == ColorSensor.Color.RED) {
        	
        		rightMotor.stop();
        		leftMotor.forward();
        	}
        	else if(sensor.getColor() == ColorSensor.Color.BLACK) {
        		return;
        	}
        	else {
        		leftMotor.stop();
        		rightMotor.forward();
        	}
        
        	myRobot.sleep(50);
        	currentColour = sensor.getColor();
        	System.out.println(currentColour);
        	
        }
        
	}
	
	public void followBlueDot() {
		leftMotor.setSpeed(100);
        rightMotor.setSpeed(100);
        leftMotor.forward();
        rightMotor.forward();
        
        while(true) {
        	if(sensor.getColor() == ColorSensor.Color.BLUE) {
        	
        		rightMotor.stop();
        		leftMotor.forward();
        	}
        	else if(sensor.getColor() == ColorSensor.Color.BLACK) {
        		return;
        	}
        	else {
        		leftMotor.stop();
        		rightMotor.forward();
        	}
        
        	myRobot.sleep(50);
        	currentColour = sensor.getColor();
        	System.out.println(currentColour);
        	
        }
        
	}
	
	public void followGreenDot() {
		leftMotor.setSpeed(100);
        rightMotor.setSpeed(100);
        leftMotor.forward();
        rightMotor.forward();
        
        while(true) {
        	if(sensor.getColor() == ColorSensor.Color.GREEN) {
        	
        		rightMotor.stop();
        		leftMotor.forward();
        	}
        	else if(sensor.getColor() == ColorSensor.Color.BLACK) {
        		return;
        	}
        	else {
        		leftMotor.stop();
        		rightMotor.forward();
        	}
        
        	myRobot.sleep(50);
        	currentColour = sensor.getColor();
        	System.out.println(currentColour);
        	
        }
        
	}
	
	public void followYellowDot() {
		leftMotor.setSpeed(100);
        rightMotor.setSpeed(100);
        leftMotor.forward();
        rightMotor.forward();
        
        while(true) {
        	if(sensor.getColor() == ColorSensor.Color.YELLOW) {
        	
        		rightMotor.stop();
        		leftMotor.forward();
        	}
        	else if(sensor.getColor() == ColorSensor.Color.BLACK) {
        		return;
        	}
        	else {
        		leftMotor.stop();
        		rightMotor.forward();
        	}
        
        	myRobot.sleep(50);
        	currentColour = sensor.getColor();
        	System.out.println(currentColour);
        	
        }
        
	}
	
	public void disconnectRobot() {
		myRobot.close();
	}
	
}
