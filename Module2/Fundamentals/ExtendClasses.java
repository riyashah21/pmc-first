package Fundamentals;

public class ExtendClasses extends Classes {

	public int seatheight;
	public ExtendClasses(int seatheight, int start,int Sspeed,int Sgear) {
		super(start,Sspeed,Sgear);
		seatheight=start;
	}
	public void seatheight(int newvalue) {
		seatheight=newvalue;
	}
}
