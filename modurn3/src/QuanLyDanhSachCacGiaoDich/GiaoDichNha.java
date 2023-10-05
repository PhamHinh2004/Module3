package QuanLyDanhSachCacGiaoDich;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich{

	String loaiNha;
	String diaChi;
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, float dienTich, String loaiNha,
			String diaChi) throws Exception{
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
////		while(loaiNha!="cao cap"&&loaiNha!="thuong") {
////			System.out.println("Nha chi co 2 loai thuong va cao cap");
////			this.setLoaiNha(sc.nextLine());
		this.loaiNha = loaiNha;
//		//}
		this.diaChi = diaChi;
	}

	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public float thanhTien() {
		if(this.loaiNha=="thuong") {
			return (float) super.getDienTich()*super.getDonGia();
		}
		else {
			return (float) (super.getDienTich()*super.getDonGia()*0.9);
		}
	}
	@Override
	public String toString() {
		return "GiaoDichNha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + "maGiaoDich=" + this.getMaGiaoDich() + ", ngayGiaoDich=" + this.getNgayGiaoDich() + ", donGia=" + this.getDonGia()
				+ ", dienTich=" + this.getDienTich() + "Thanh tien :"+ this.thanhTien()+"]";
	}
	
}
