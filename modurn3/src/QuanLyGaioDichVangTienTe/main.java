package QuanLyGaioDichVangTienTe;

import java.time.LocalDate;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		try {
			int count_vang = 0;
			int count_tiente = 0;
			int count_SoLuongGiaoDich = 0;
			long sumThanhTien = 0;
		GiaoDichTienTe gdtt_1 = new GiaoDichTienTe("123",LocalDate.of(2022, 9, 1), 2000, 100,2.5 , "USD");
		GiaoDichTienTe gdtt_2 = new GiaoDichTienTe("123",LocalDate.of(2023, 3, 22), 500, 120,3.2 , "Euro");
		GiaoDichTienTe gdtt_3 = new GiaoDichTienTe("123",LocalDate.of(2021, 10, 5), 1500, 100,1.0 , "VietNam");
		GiaoDichTienTe gdtt[] = new GiaoDichTienTe[10];
		gdtt[0] = gdtt_1;
		gdtt[1] = gdtt_2;
		gdtt[2] = gdtt_3;
		GiaoDichVang gdv_1 = new GiaoDichVang("456", LocalDate.of(2023,10,20),2000, 156,"Vang Trang" );
		GiaoDichVang gdv_2 = new GiaoDichVang("456", LocalDate.of(2023,9,1),1900, 123,"Vang Đen" );
		GiaoDichVang gdv_3 = new GiaoDichVang("456", LocalDate.of(2022,1,20),320000000000L, 200,"Vang Do" );
		GiaoDichVang gdv[] = new GiaoDichVang[10];
		GiaoDich gd[] = new GiaoDich[10];
		gd[0] = gdtt_1;
		gd[1] = gdtt_2;
		gd[2] = gdtt_3;
		gd[3] = gdv_1;
		gd[4] = gdv_2;
		gd[5] = gdv_3;
		for(int i=0;gd[i]!=null;i++) {
			if(gd[i] instanceof GiaoDichTienTe) {
				count_SoLuongGiaoDich+=1;
				count_tiente += gd[i].getSoLuong();
				sumThanhTien+= gdtt[i].thanhTien();			}
			else {
				count_vang += gd[i].getSoLuong();
			}
		}
		System.out.println(". So luong giao dich tien te :"+count_tiente);
		System.out.println(". So luong giao dich vang :"+count_vang);
		System.out.println(". Trung binh giao dich thanh tien cua tien te :"+(sumThanhTien/count_SoLuongGiaoDich));
		System.out.println("----------------Cac Giao Dich Co Don Gia > 1 Ty----------------");
		for(int i=0;gd[i]!=null;i++) {
			if(gd[i].getDonGia()>(long)Math.pow(100,2)) {
				System.out.println(gd[i].toString());
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
