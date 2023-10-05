package MangementEmployee;

public class HourlyEmployee extends Employee{
	private float hourlyWage , hours;

	public HourlyEmployee(String firstName, String lastName, String social_security_number, float hourlyWage,
			float hours) {
		super(firstName, lastName, social_security_number);
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}

	public float getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(float hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}
	
	public double getTienTheoHour() {
		if(this.hours<=40) {
			return this.hourlyWage*hours;
		}
		else {
			return 40*this.hourlyWage+(this.hours-40)*this.hourlyWage*1.5;
		}
	}

	@Override
	public String toString() {
		return "HourlyEmployee ["+ super.toString() +", hourlyWage=" + hourlyWage + ", hours=" + hours + ", Luong cua nhan vien" + this.getTienTheoHour()+"]";
	}
	
}
