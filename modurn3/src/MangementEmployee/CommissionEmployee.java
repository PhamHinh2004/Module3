package MangementEmployee;

public class CommissionEmployee extends Employee{
	private int grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String social_security_number, int grossSales,
			double commissionRate) {
		super(firstName, lastName, social_security_number);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double tinhTienNhanVienPartTime() {
		return this.commissionRate * grossSales;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [" + super.toString() + ", grossSales=" + grossSales + ", commissionRate=" + commissionRate + "Tien nhan vien part-time" + this.tinhTienNhanVienPartTime()+ "]";
	}
	
}
