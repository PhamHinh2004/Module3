package HoaDon;

import java.time.LocalDate;

public class HoaDonNgay extends HoaDon{
	private float soNGayThue;

	public HoaDonNgay(String maHD, LocalDate ngayHD, String name, String maPhong, float donGia, float soNGayThue) {
		super(maHD, ngayHD, name, maPhong, donGia);
		this.soNGayThue = soNGayThue;
	}

	public float getSoNGayThue() {
		return soNGayThue;
	}

	public void setSoNGayThue(float soNGayThue) {
		this.soNGayThue = soNGayThue;
	}
	
	public long thanhTien() {
		if(this.soNGayThue>7) {
			return (long) (super.getDonGia()*this.soNGayThue*0.2);
		}
		else {
			return (long) (super.getDonGia()*this.soNGayThue);
		}
	}

	@Override
	public String toString() {
		return "HoaDonNgay [soNGayThue=" + soNGayThue + super.toString()+"]";
	}
	
}
