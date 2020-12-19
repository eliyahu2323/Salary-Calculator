package Math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Calculation implements Inter_Calculation {

	private  List<HourPerDay> a;
	private double moneyPerHour;
	private double totalsalary;
	private double sum100;
	private double sum125;
	private double sum150;
	private double sumall;

	@Override
	public void SumHourMount(ArrayList<HourPerDay> a) {
		HourInmount(a);
		salary();
		totalsalary=(sum100*moneyPerHour)+(sum125*moneyPerHour*1.25)+(sum150*moneyPerHour*1.5);
	}

	@Override
	public void AddHour(HourPerDay b) {
		this.a.add(b);
	}

	@Override
	public double calc(HourPerDay c) {

		return 0;
	}

	@Override
	public void HourInmount(ArrayList<HourPerDay> a) {
		Iterator<HourPerDay> it=a.iterator();
		double x=0;
		double y=0;
		double z=0;

		while(it.hasNext()) {
			x+=it.next().getHour();
		}
		it=a.iterator();
		while(it.hasNext()) {
			y+=it.next().getfirst();
		}
		it=a.iterator();

		while(it.hasNext()) {
			z+=it.next().getsecend();
		}
		
		this.sum100=x;
		this.sum125=y;
		this.sum150=z;
		sumall=x+y+z;	
	}

	@Override
	public double NetSalary(double grossSalary) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void salary() {
		System.out.println("input src:");
		Scanner sc1=new Scanner(System.in);	
		double sal=sc1.nextDouble();
		System.out.println("salary ="+sal);
		this.moneyPerHour=sal;
	}

	public double getsalary() {
		return this.totalsalary;
	}

	public double getsal() {
		return moneyPerHour;
	}

	public double getsum100() {
		return this.sum100;
	}

	public double getsum125() {
		return this.sum125;
	}

	public double getsum150() {
		return this.sum150;
	}


}
