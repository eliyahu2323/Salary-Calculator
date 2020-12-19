package Math;

import java.util.ArrayList;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<HourPerDay> a=new  ArrayList<HourPerDay>() ;

		HourPerDay a1=new HourPerDay(23.5);
		HourPerDay a2=new HourPerDay(2.5);
		HourPerDay a3=new HourPerDay(53.5);
		HourPerDay a4=new HourPerDay(23.5);
		HourPerDay a5=new HourPerDay(3.5);
		HourPerDay a6=new HourPerDay(18.5);
		HourPerDay a7=new HourPerDay(12.5);

		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		a.add(a6);
		a.add(a7);

		MyGui b=new MyGui();
		System.out.println(b);
		//		Calculation t=new Calculation();
		//		t.SumHourMount(a);
		//		System.out.println(t.getsalary());



	}

}
