package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	 static int speed = 500;
	 void goStraight(int howlong){
		 driveDirect(speed,speed);
		 sleep(howlong);
		 
		 
	 }	 
	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		 goStraight(2500);
		 
		 driveDirect(10,speed);
		 sleep(500);
		 
		 goStraight(2200);
		
		 driveDirect(speed,10);
		 sleep(500);
		 
		 goStraight(2500);
		 
		 driveDirect(10,speed);
		 sleep(500);
		 
		 goStraight(2000);
		
		 driveDirect(speed,10);
		 sleep(500);
		 
		 goStraight(2500);
		 
		 
	}

	public void loop() {
	
	}
}
