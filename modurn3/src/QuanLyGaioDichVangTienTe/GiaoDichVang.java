package QuanLyGaioDichVangTienTe;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
	private String loaiVang;

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, long donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	public float thanhTien() {
		return (float) this.getDonGia()*this.getSoLuong();
	}

	@Override
	public String toString() {
		return "GiaoDichVang [maGiaoDich=" + super.getMaGiaoDich() + ", ngayGiaoDich=" + super.getNgayGiaoDich() + ", donGia=" + super.getDonGia()+ ", soLuong=" + super.getSoLuong() +"loaiVang=" + loaiVang + "]";
	}
	
}
