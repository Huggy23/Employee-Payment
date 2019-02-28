
public class PaidAdvisor extends Person {
	
	public double regular;
	public double special;
	public double overtime;
	public int hours;
	public int hspecial;
	
	public PaidAdvisor(String first, String last, double regularPayRate, double specialPayRate, double overtimePayRate, int hoursWorked,
			int hoursSpecial) {
		super.setName(first, last);
		regular = regularPayRate;
		special = specialPayRate;
		overtime = overtimePayRate;
		hours = hoursWorked;
		hspecial = hoursSpecial;
		
	}
	
	public int getHoursWorked()
	{
		return hours = hours - hspecial;
	}
	
	public double getPayRate()
	{
		if (hours <= 30) {
			return regular;
		} else return overtime ;
	}
	
	public double getSpecialHoursWorked()
	{
		return hspecial;
	}
	
	public double getSpecialPayRate()
	{
		return special;
	}

	public String toString()
	{
		return ("Total Pay: " + calculatePay());
	}

	public double calculatePay()
	{
		return (getHoursWorked() * getPayRate()) + (getSpecialPayRate() * getSpecialHoursWorked());
	}
	
	public void setNameRateHours()
	{
		getFirstName();
		getLastName();
		getPayRate();
		getHoursWorked();
		
	}

}