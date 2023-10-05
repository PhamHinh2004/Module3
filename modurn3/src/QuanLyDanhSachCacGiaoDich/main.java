package QuanLyDanhSachCacGiaoDich;

import java.time.LocalDate;

public class main {
	public static void main(String[] args) {
			try{
				int a_Dat= 0, b_Dat= 0, c_Dat = 0;
				int normal_Nha= 0, luxury_Nha= 0;
				float sumTienDat = 0;
			GiaoDichDat gdd_1 = new GiaoDichDat("123",LocalDate.of(2023, 10, 5), 2000, 20, "B");
			GiaoDichDat gdd_2 = new GiaoDichDat("123",LocalDate.of(2023, 5, 5), 3000, 10, "C");
			GiaoDichDat gdd_3 = new GiaoDichDat("123",LocalDate.of(2023, 1, 1), 3310, 50, "A");
			GiaoDichDat gdd[] = new GiaoDichDat[4];
			gdd[0] = gdd_1;
			gdd[1] = gdd_2;
			gdd[2] = gdd_3;
			// in ra cac danh sach giao dich dat 
			System.out.println("-------------Danh sach giao dich dat--------------");
			for(int i=0;gdd[i]!=null;i++) {
				System.out.println(gdd[i].toString());
			}
			GiaoDichNha gdn_1 = new GiaoDichNha("456",LocalDate.of(2020, 5, 3), 5000, 100,"thuong","Tp HCM");
			GiaoDichNha gdn_2 = new GiaoDichNha("456",LocalDate.of(2021, 3, 3), 5020, 100,"thuong","Vung Tau");
			GiaoDichNha gdn_3 = new GiaoDichNha("456",LocalDate.of(2013, 9, 2), 10000, 100,"cao cap","Tp HCM");
			GiaoDichNha gdn[] = new GiaoDichNha[4];
			gdn[0] = gdn_1;
			gdn[1] = gdn_2;
			gdn[2] = gdn_3;
			// in ra cac danh sach giao dich nha
			System.out.println("-------------Danh sach giao dich nha--------------");
			for(int i=0;gdd[i]!=null;i++) {
				System.out.println(gdn[i].toString());
			}
			
			GiaoDich [] gd = new GiaoDich[10];
			gd[0] = gdd_1;
			gd[1] = gdd_2;
			gd[2] = gdd_3;
			gd[3] = gdn_1;
			gd[4] = gdn_2;
			gd[5] = gdn_3;
			// tinh so luong loai dat 
			for(int i=0;gdd[i]!=null;i++) {
				sumTienDat += gdd[i].thanhTien();
				if(gdd[i].getLoaiDat()=="A")	a_Dat+=1;
				else if(gdd[i].getLoaiDat()=="B") b_Dat+=1;
				else c_Dat+=1;
			}
			// tinh so luong loai nha 
			for(int i=0;gdn[i]!=null;i++) {
				if(gdn[i].getLoaiNha()=="thuong") normal_Nha+=1;
				else luxury_Nha+=1;
			}
			// tao 2 tham chieu day_end va day_start
			LocalDate day_end = LocalDate.of(2013, 9, 30);
			LocalDate day_start = LocalDate.of(2013,9,1);
			System.out.println("------------Giao Dich trong thang 9---------------");
			for(int i=0;gd[i]!=null;i++) {
				if( gd[i].getNgayGiaoDich().isAfter(day_start)== true && gd[i].getNgayGiaoDich().isBefore(day_end)==true) {
					System.out.println(gd[i].toString());
				}                                                              
			}
			// print kind of dat trong cac data dau vao
			System.out.println("-----------------Dat----------------");
			System.out.println(". loai dat A:"+ a_Dat);
			System.out.println(". loai dat B:"+ b_Dat);
			System.out.println(". loai dat C:"+ c_Dat);
			// print kind of nha trong cac data dau vao
			System.out.println("-----------------Nha----------------");
			System.out.println(". loai nha thuong"+ normal_Nha);
			System.out.println(". loai nha cao cap:"+ luxury_Nha);
			
		} catch (Exception e) {
		}
	}
}
