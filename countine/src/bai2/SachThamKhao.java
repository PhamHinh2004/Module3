package bai2;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private long thue;

	public SachThamKhao(String naSach,LocalDate ngayNhap, long donGia, int soLuong, String nhaXuatBan, long thue)throws Exception {
		super(naSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}
	
	public long thanhTien() {
		return (long) super.soLuong*super.donGia+this.thue;
	}

	@Override
	public String toString() {
		return "SachThamKhao [thue=" + thue +super.toString()+ "]";
	}
	
}
