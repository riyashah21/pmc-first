package Fundamentals;

public class Classes {

	public int cadence;
	public int gear;
	public int speed;
	
	public Classes(int start,int Sspeed,int Sgear) {
		gear=Sgear;
		cadence=start;
		speed=Sspeed;
	}
	public void setC(int newvalue) {
		cadence =newvalue;
	}
	public void setG(int newvalue) {
		gear=newvalue;
	}
	public void setS(int decrement) {
		speed -=decrement;
	}
	public void speedUp(int increment) {
        speed += increment;
    }
        
}

