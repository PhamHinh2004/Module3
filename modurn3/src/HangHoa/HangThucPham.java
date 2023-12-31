package HangHoa;

import java.time.LocalDate;

public class HangThucPham extends HangHoa{
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String nhaCungCap;
	
	public HangThucPham(String maHang, String tenHang, float donGia, int soLuongTon, LocalDate ngaySanXuat,
			LocalDate ngayHetHan, String nhaCungCap) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
		setNhaCungCap(nhaCungCap);
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(ngaySanXuat)) {
			this.ngaySanXuat = LocalDate.now();		
		}else {
			this.ngaySanXuat = ngaySanXuat;
		}
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isBefore(this.ngaySanXuat)) {
			this.ngayHetHan = this.ngaySanXuat;		
		}else {
			this.ngaySanXuat = ngaySanXuat;
		}
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
}
