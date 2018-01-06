import ShefRobot.*;

/**
 *

 */
public class Assignment3 {

   
    public static void main(String[] args) {
/*
        //Create a robot object to use and connect to it
        Robot myRobot = new Robot();
       
        //The robot is made of components which are themselves objects.
        //Create references to them as useful shortcuts
        Motor leftMotor = myRobot.getLargeMotor(Motor.Port.D);
        Motor rightMotor = myRobot.getLargeMotor(Motor.Port.A);
        Speaker speaker = myRobot.getSpeaker();
        ColorSensor sensor = myRobot.getColorSensor(Sensor.Port.S1);
        boolean lineFound  = false;
        
    */  Car car = new Car();
    	Dot listOfDots[] = new Dot[16];
    
    
        // Look for the black line
        car.findBlackLine();
        
        car.followBlackLine();
        
        
        
        car.disconnectRobot();
        
        
        
        //Turn  left and keep following the line

        //Disconnect from the Robot
        //myRobot.close();

    }
    
   
    
    

}
