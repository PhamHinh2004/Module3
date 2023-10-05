package HoaDon;

import java.time.LocalDate;

public class HoaDonGio extends HoaDon{
	private float soGio;
	private float count = 0;
	HoaDonNgay hdn;
	public HoaDonGio(String maHD, LocalDate ngayHD, String name, String maPhong, float donGia, float soGio) {
		super(maHD, ngayHD, name, maPhong, donGia);
		this.soGio = soGio;
	}
	public float getSoGio() {
		return soGio;
	}

	public void setSoGio(float soGio) {
		this.soGio = soGio;
	}
	
	public long thanhTien() {
		if(this.soGio>24 && this.soGio<30) {
			return (long) (this.soGio*super.getDonGia()*24);
		}
		if(this.soGio>=30) {
			count = (int) this.soGio/24;
			hdn = new HoaDonNgay(super.getMaHD(), super.getNgayHD(), super.getName(), super.getMaPhong(), this.soGio, this.count);
			return hdn.thanhTien();
		}
		else {
			return -1;
		}
	}
	@Override
	public String toString() {
		return "HoaDonGio [soGio=" + soGio + super.toString() + "]";
	}
	
}
