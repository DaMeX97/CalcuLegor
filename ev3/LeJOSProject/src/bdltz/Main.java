package bdltz;

import lejos.hardware.BrickFinder;
import lejos.hardware.Button;
import lejos.hardware.Power;
import lejos.hardware.motor.Motor;

public class Main {
	public static void main(String[] args) {
	    //System.out.println("Insert the pen.");	
	    
	    //Motor.C.rotate(800);
	    	    
	    //Button.waitForAnyPress();
	    
	    //Power power = BrickFinder.getDefault().getPower();
	    
	    //System.out.println(power.getVoltage());
	    
	    
	    //SimplePrinter printer = new SimplePrinter("ciao");
	    //printer.startPrinting();
				
		BTHelper bt = new BTHelper();
	    
	    System.out.println("Finished.");
	    
	    Button.waitForAnyPress();
	}
}