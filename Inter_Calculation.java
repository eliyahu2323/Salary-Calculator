package Math;

import java.util.ArrayList;

public interface Inter_Calculation {

	/**
	 * Calculates the monthly working hours
	 * @param a this Array of HourPerDay 
	 */
	public void SumHourMount(ArrayList<HourPerDay> a);
	
	/**
	 * function that add HourPerDay of Array
	 * @param b
	 */
	public void AddHour(HourPerDay b);
	
	/**
	 * 
	 * @param c 
	 * @return calculation of day in  
	 */
	public double calc(HourPerDay c);
	
	/**
	 * @param a Array of hours
	 * @return how much total hour you work in the mount 
	 */
	public void HourInmount(ArrayList<HourPerDay> a);
	
	/**
	 * 
	 * @param grossSalary
	 * @return net salary 
	 */
	public double NetSalary(double grossSalary);
	
	public void salary();
}
