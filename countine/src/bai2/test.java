package bai2;

import java.time.LocalDate;
import java.util.Scanner;


public class test {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			SachThamKhao stk_1 = new SachThamKhao("Toan Giai",LocalDate.of(2023, 9, 21), 100L, 2,"Kim Lan", 10);
			SachThamKhao stk_2 = new SachThamKhao("Toan Cao Cap",LocalDate.of(2023, 10, 23), 300L, 1,"IUH", 20);
			SachGiaoKhoa sgk_1 = new SachGiaoKhoa("Doremon",LocalDate.of(2022, 1, 1),200L,2,"Kim Dong","moi");
			SachGiaoKhoa sgk_2 = new SachGiaoKhoa("Conan",LocalDate.of(2023, 1, 1),200L,2,"Kim Dong","cu");
			SachThamKhao[] stk = new SachThamKhao[3];
				stk[0] = stk_1;
				stk[1] = stk_2;
			SachGiaoKhoa[] sgk = new SachGiaoKhoa[3];
				sgk[0] = sgk_1;
				sgk[1] = sgk_2;
			Sach[] e = new Sach[6];
			e[0] =  stk_1;
			e[1] =  stk_2;
			e[2] =  sgk_1;
			e[3] =  sgk_2;
			int count =0;
			long sumSachThamKhao = 0;
			long sumSachGiaoKhoa = 0;
			long sum_ALL = 0;

			for(int i=0;i<5;i++) {
				if(e[i] instanceof SachGiaoKhoa) {
					sumSachGiaoKhoa+=(long)(e[i].getDonGia()*e[i].getSoLuong());
					sum_ALL += e[i].getDonGia();
					count+=1;
				}
				if(e[i] instanceof SachThamKhao) {
					sumSachThamKhao+=e[i].getDonGia();
					sum_ALL += e[i].getDonGia();
					count+=1;
				}
			}
			System.out.println("--------------------Tong so tien sach tham khao-----------------");
			System.out.println("Tong so tien sach tham khao:"+sumSachThamKhao);
			System.out.println("--------------------Tong so tien sach Giao khao-----------------");
			System.out.println("Tong so tien sach giao khao:"+sumSachGiaoKhoa);
			System.out.println("--------------------Trung Binh Cong-----------------");
			System.out.println("Trung binh cong don gia tat ca sach:"+(sum_ALL/count));
			int check = 0;
			String nhaXuatBan = null;
			System.out.println("Nha xuat ban muon xuat :");
			nhaXuatBan =  sc.nextLine();
			for(int i =0 ;e[i]!=null;i++) {
				if(e[i].getNhaXuatBan().equalsIgnoreCase(nhaXuatBan)) {
					System.out.println(e[i].toString());
					check=1;
				}
			}
			if(check==0) {
				System.out.println("Khong co sach nao co nha xuat ban nay");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
