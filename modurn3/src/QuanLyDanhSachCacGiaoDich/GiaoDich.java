package QuanLyDanhSachCacGiaoDich;

import java.time.LocalDate;

public class GiaoDich {
	private String maGiaoDich ;
	private LocalDate ngayGiaoDich;
	private float donGia;
	private float dienTich;
	
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, float dienTich) {
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
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

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) throws Exception{
		if(ngayGiaoDich.isAfter(LocalDate.now())) {
			this.ngayGiaoDich = LocalDate.now();
		}
		else {
			this.ngayGiaoDich = ngayGiaoDich;
		}
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia
				+ ", dienTich=" + dienTich + "]";
	}
	
}
