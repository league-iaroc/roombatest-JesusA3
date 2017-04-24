package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		driveDirect(1000,1000);
        sleep(1000);
      
        driveDirect(10,1000);
		sleep(320);
		 
		driveDirect(1000,1000);
			sleep(3600);

			driveDirect(10,1000);
			sleep(320);
			
			driveDirect(1000,1000);
			sleep(3550);

	}

	public void loop() {
	
	}
}
