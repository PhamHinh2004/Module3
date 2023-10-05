package QuanLyDanhSachCacGiaoDich;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich{
	String loaiDat ;
	Scanner sc = new Scanner(System.in);
	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, float dienTich, String loaiDat) throws Exception{
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		if(loaiDat!="A"&&loaiDat!="B"&&loaiDat!="C") {
				System.out.println("Chi co 3 loai A B C");
				this.setLoaiDat(sc.nextLine());
		}else {
			this.loaiDat = loaiDat;
		}
	}
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat){
		this.loaiDat = loaiDat;
	}
	public float thanhTien() {
		if(loaiDat=="A") {
			return (float) super.getDienTich()*super.getDonGia();
		}
		else {
			return (float) (super.getDienTich()*super.getDonGia()*1.5);
		}
	}
	@Override
	public String toString() {
		return "GiaoDichDat [loaiDat=" + loaiDat + "maGiaoDich=" + this.getMaGiaoDich() + ", ngayGiaoDich=" + this.getNgayGiaoDich() + ", donGia=" + this.getDonGia()
				+ ", dienTich=" + this.getDienTich() + "]";
	}
	
}
