public class Microwave {
	// Initialize variable 
	private int power = 1;
	private int time = 0;
	int timeBy30 = 30;

	
	 public String power() {
		if(power == 1) {
			power = 2;
		}
		else {
			power = 1;
		}
		String powerButton = "Power Button was pressed. Power level is " + power;
		
		return powerButton;
	}
	
	public String time() {
		time = time + timeBy30;
		
		String timeButton = "TimeButton was pressed. Time is " + time + " seconds";
		
		return timeButton;
		
	}
	
	public String reset() {
		if(power != 1) {
			power = 1;
		}
		if(time != 0) {
			time = 0;
		}
		
		String resetButton = "Reset Button was pressed. Power level is " + power + ". Time is " + time + " seconds";
		
		return resetButton;
		
		}

	

	public String start() {
		
		String startMessage = ("Cooking for " + time + " seconds at level "+ power + ".");
		
		return startMessage;
		
		
	}

}
	
