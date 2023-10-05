package QuanLyGaioDichVangTienTe;

import java.time.LocalDate;

public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private long donGia;
	private int soLuong;
	


	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, long donGia, int soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + "]";
	}
	
	
	
}	
