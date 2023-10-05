package bai2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Sach {
	String naSach;
	LocalDate ngayNhap;
	long donGia;
	int soLuong;
	String nhaXuatBan;
	
	public Sach(String naSach,LocalDate ngayNhap, long donGia, int soLuong, String nhaXuatBan) throws Exception{
		if(ngayNhap.isAfter(LocalDate.now())) {
			this.naSach = naSach;
			this.ngayNhap = LocalDate.now();
			this.donGia = donGia;
			this.soLuong = soLuong;
			this.nhaXuatBan = nhaXuatBan;
		}
		else {
			this.naSach = naSach;
			this.ngayNhap = ngayNhap;
			this.donGia = donGia;
			this.soLuong = soLuong;
			this.nhaXuatBan = nhaXuatBan;
		}
	}

	@Override
	public String toString() {
		return "Sach [naSach=" + naSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXuatBan=" + nhaXuatBan + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nhaXuatBan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		return Objects.equals(nhaXuatBan, other.nhaXuatBan);
	}

	public String getNaSach() {
		return naSach;
	}

	public void setNaSach(String naSach) {
		this.naSach = naSach;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
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

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	
}	
