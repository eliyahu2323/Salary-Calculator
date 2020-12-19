package Math;

import java.util.ArrayList;

public class HourPerDay {


	private double hour;
	private double  first;
	private double secend;

	public HourPerDay(double h) {		
		if(h>8) {
			if(h>10) {

				this.hour=8;
				this.first=2;
				this.secend=h-10;
			}
			else {
				this.hour=8;
				this.secend=0;
				this.first=h-8;
			}

		}
		else {
			this.first=this.secend=0;
			this.hour=h;
		}
	}

	public HourPerDay() {
		this.hour=0;

	}
	
	public double getHour() {
		return this.hour;
	}

	public double getfirst() {
		return this.first;
	}
	
	public double getsecend() {
		return this.secend;
	}

public String toString() {
	return "hours"+hour+" first "+first+" sec "+secend;
}











}
