package bai2;

import java.time.LocalDate;
import java.util.Date;

public class SachGiaoKhoa extends Sach{
	String tinhTrang ;

	public SachGiaoKhoa(String naSach,LocalDate ngayNhap, long donGia, int soLuong, String nhaXuatBan, String tinhTrang) throws Exception {
		super(naSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;	
	}
	public long thanhTien() {
		if(tinhTrang=="moi") {
			return (long) this.soLuong*this.donGia;
		}
		else {
			return (long) (this.soLuong*this.donGia*0.5);
		}
	}
	@Override
	public String toString() {
		return "SachGiaoKhoa [tinhTrang=" + tinhTrang+super.toString()+"]";
	}
	
}
