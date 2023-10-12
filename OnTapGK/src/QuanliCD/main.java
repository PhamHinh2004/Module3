package QuanliCD;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			CDlist cd = new CDlist(10);
			int luachon =0 ;
			int maTimKiem ;
			cd.addCD(new CD(123,"Hinh",3,200));
			cd.addCD(new CD(123,"Buon",3,200));
			do {
				System.out.println("1/ Tinh so luong CD");
				System.out.println("2/ Tinh tong gia thanh CD");
				System.out.println("3/ Tra thong tin toan bo CD trong danh sach");
				System.out.println("4/ Tim kiem theo ma");
				System.out.println("5/ Sap xep danh sach giam dan theo gia thanh");
				System.out.println("6/ Sap xep danh sach tang dan theo tua CD");
				System.out.println("Lua chon :");
				luachon = sc.nextInt();
				if(luachon==1) {
					System.out.println("so luong danh sach :" + cd.soLuongCD());
				}
				else if(luachon ==2 ) {
					System.out.println("Tong gia thanh CD:"+cd.tinhTongGiaThanh());
				}
				else if(luachon == 3) {
					cd.thongTinTrongDanhSachCD();
				}
				else if(luachon == 4) {
					System.out.println("Ma muon tim kiem: ");
					maTimKiem = sc.nextInt();
					cd.timKiemTheoMa(maTimKiem);
				}
				else if(luachon == 5) {
					System.out.println("----------------Sap Xep danh sach Giam Dan-----------------");
					cd.sapXepGiamDanTheoGiaThanh();
				}
				else if(luachon == 6) {
					System.out.println("----------------Sap Xep danh sach Tang Dan-----------------");
					cd.sapXepTangDanTheoTuaCD();
				}
			}
			while(luachon != 0);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
