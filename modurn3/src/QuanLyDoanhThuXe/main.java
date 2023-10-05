package QuanLyDoanhThuXe;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		XeNgoaiThanh xnt_1 = new XeNgoaiThanh("A", "Pham Van Hinh", "12345", 10000, 2, 200);
		XeNgoaiThanh xnt_2 = new XeNgoaiThanh("A", "Pham Van Hoan", "12345", 22000, 1, 300);
		XeTrongThanh ntt_1 = new XeTrongThanh("B","Trinh Van A", "423412",12000,"Ho Chi Minh", 2);
		XeTrongThanh ntt_2 = new XeTrongThanh("B","Trinh Van B", "423412",12000,"Dong Nai", 1);
		
//		XeTrongThanh[] xtt = new XeTrongThanh[3];
//		xtt[0] = ntt_1;
//		xtt[1] = ntt_2;
//		
//		XeNgoaiThanh[] xnt = new XeNgoaiThanh[3];
//		xnt[0] = xnt_1;
//		xnt[1] = xnt_2;
		
		Transformation trans[] = new Transformation[5];
		trans[0] = xnt_1;
		trans[1] = xnt_2;
		trans[2] = ntt_1;
		trans[3] = ntt_2;
		
		long doanhThuXeNgoaiThanh = 0;
		long doanhThuXeTrongThanh = 0 ;
		for(int i=0;trans[i]!=null;i++) {
			if(trans[i] instanceof XeTrongThanh ) {
				doanhThuXeTrongThanh += trans[i].getDoanhThu();
			}
			else {
				doanhThuXeNgoaiThanh += trans[i].getDoanhThu();
			}
		}
		for(int i=0;trans[i]!=null;i++) {
			System.out.println(trans[i]);
			System.out.println("Doanh thu :"+trans[i].getDoanhThu());
		}
		System.out.println("Tong doanh thu cua xe ngoai thanh la : "+doanhThuXeNgoaiThanh);
		System.out.println("Tong doanh thu cua xe trong thanh la : "+doanhThuXeTrongThanh);
	}
}
