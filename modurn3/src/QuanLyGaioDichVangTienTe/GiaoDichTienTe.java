package QuanLyGaioDichVangTienTe;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
	private String loaiTienTe;
	Scanner sc = new Scanner(System.in);
	
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, long donGia, int soLuong, double tiGia,
			String loaiTienTe) throws Exception{
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		if(loaiTienTe!="VietNam"&& loaiTienTe!="USD"&&loaiTienTe!="Euro") {
			System.out.println("ban can nhap lai chi cho phep nhan 3 loai:");
			System.out.println("1. VietNam");
			System.out.println("2. USD");
			System.err.println("3. Euro");
			setLoaiTienTe(sc.nextLine());	
		}
		else {
			this.loaiTienTe = loaiTienTe;
		}
		this.tiGia = tiGia;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	public String getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(String loaiTienTe) throws Exception{
		if(loaiTienTe!="VietNam"&& loaiTienTe!="USD"&&loaiTienTe!="Euro") {
			System.out.println("ban can nhap lai chi cho phep nhan 3 loai:");
			System.out.println("1. VietNam");
			System.out.println("2. USD");
			System.err.println("3. Euro");
			setLoaiTienTe(loaiTienTe);
		}
		else {
			this.loaiTienTe = loaiTienTe;
		}
	}
	
	public long thanhTien() {
		if(this.loaiTienTe=="USD" || this.loaiTienTe=="Euro") {
			return (long) (this.getSoLuong()*this.getDonGia()*this.tiGia);
		}
		else {
			return (long) (this.getSoLuong()*this.getDonGia());
		}
	}

	@Override
	public String toString() {
		return "GiaoDichTienTe [maGiaoDich=" + super.getMaGiaoDich() + ", ngayGiaoDich=" + super.getNgayGiaoDich() + ", donGia=" + super.getDonGia() + ", soLuong=" + super.getSoLuong()  + "tiGia=" + tiGia + ", loaiTienTe=" + loaiTienTe + "]";
	}
	
}
