package MangementEmployee;

public class BasePlusCommissionEmployee extends Employee{
	private int grossSales;
	private double commissionRate;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String social_security_number, int grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, social_security_number);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
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

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double tinhLuongNhanVienChinhThuc() {
		return (this.commissionRate * this.grossSales) + this.baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [" +super.toString() +", togrossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", baseSalary=" + baseSalary + "Tien nhan vien chinh thuc"+ this.tinhLuongNhanVienChinhThuc() + "]";
	}
	
}
