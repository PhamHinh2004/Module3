package MangementEmployee;

public class main {
	public static void main(String[] args) {
		SalariedEmployee salary = new SalariedEmployee("Hinh", "Pham", "A1", 100);
		HourlyEmployee hem = new HourlyEmployee("Hinh","Pham"," B1",20, 10);
		CommissionEmployee cmise = new CommissionEmployee("Hinh","Pham","C1", 100,0.2);
		BasePlusCommissionEmployee bsp = new BasePlusCommissionEmployee("Pham","Hinh","D1", 10, 0.3, 5000);
		Employee emp[] = new Employee[10];
		emp[0] = salary;
		emp[1] = hem;
		emp[2] = cmise;
		emp[3] = bsp;
		System.out.println(salary.toString());
		System.out.println(hem.toString());
		System.out.println(cmise.toString());
		System.out.println(bsp.toString());
	}
}
