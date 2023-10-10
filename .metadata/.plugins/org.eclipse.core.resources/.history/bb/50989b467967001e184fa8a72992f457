package HangHoa;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public HangSanhSu(String maHang, String tenHang, float donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.setNgayNhapKho(ngayNhapKho);
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) throws Exception{
		if(ngayNhapKho.isAfter(LocalDate.now())) {
			this.ngayNhapKho = ngayNhapKho;
		}else {
			this.ngayNhapKho = LocalDate.now();
		}
	}
	
}
