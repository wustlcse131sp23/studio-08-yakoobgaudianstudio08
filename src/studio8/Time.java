package studio8;


public class Time {
	private int hour;
	private int minute;
	private boolean military;

	
	/**
	 * @param minutes 
	 * @param hours 
	 *  
	 */
	public Time(int m, int h, boolean mil) {
		this.minute=m;
		this.hour=h;
	
	
	this.military=mil;
	
	}
	public String toString() {
		
	if(military==true) {
		return  hour + ":" + minute;
	}
	else {
		return hour%12 +":" + minute;
	}
	}
	public static void main(String[] args) {
 
	Time A = new Time(36, 1, false);
	System.out.println(A.toString());
	
    Time B = new Time(15, 22, false);
    System.out.println(B.toString());
    }

}