
public class Microwave {

	//public static void main(String[] args) {
		

	//}
	private int powerInt() {
		int power = 1;
		
		if(power == 1) {
			power = 2;
		}
		else {
			power = 1;
		}
		return power;
	}
	
	private int increaseTime() {
		int time = 0;
		int timeBy30 = 30;
		time = time + timeBy30;
		return time;
	}
	
	public int resetAll() {
		if(powerInt() != 0) {
			powerInt() = 0;
		}
	}
	
	public void printStuff() 
	{
		System.out.println(increaseTime());
		System.out.println(powerInt());
	}
}
