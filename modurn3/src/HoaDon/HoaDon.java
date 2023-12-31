package HoaDon;

import java.time.LocalDate;
import java.util.Objects;

public class HoaDon {
	private String maHD ;
	private LocalDate ngayHD;
	private String name;
	private String maPhong;
	private float donGia;
	public HoaDon(String maHD, LocalDate ngayHD, String name, String maPhong, float donGia) {
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.name = name;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public LocalDate getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(LocalDate ngayHD) {
		this.ngayHD = ngayHD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(donGia, maHD, maPhong, name, ngayHD);
//	}
//	@Override
////	public boolean equals(Object obj) {
////	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngayHD=" + ngayHD + ", name=" + name + ", maPhong=" + maPhong + ", donGia="
				+ donGia + "]";
	}
	
	
}
