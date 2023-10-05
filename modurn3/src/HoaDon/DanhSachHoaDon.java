package HoaDon;

import java.util.Arrays;

public class DanhSachHoaDon {
	private HoaDon hd[];
	int count = 0;
	int countHopDongGio = 0;
	int countHopDongNgay = 0;
	double sumTongTienThagAndNam = 0 ;
	public DanhSachHoaDon(int ptu) {
		HoaDon hd[] = new HoaDon[ptu];
	}
	public boolean addHoaDon(HoaDon hd) {
		for(int i=0; this.hd[i]!=null;i++) {
			if(this.hd[i].getNgayHD().equals(hd.getMaHD())) {
				return false;
			}
		}
		this.hd[count] = hd;
		count +=1;
		return true;
	}
	@Override
	public String toString() {
		return  Arrays.toString(hd) ;
	}
	
	public int thongKeSoLuongHDTheoGio() {
		for(int i=0;i<count;i++) {
			if(hd[i] instanceof HoaDonGio) {
				countHopDongGio++;
			}
		}
		return countHopDongGio;
	} 
	
	public int thongKeSoLuongHDTheoNgay() {
		for(int i=0;i<count;i++) {
			if(hd[i] instanceof HoaDonGio) {
				countHopDongNgay++;
			}
		}
		return countHopDongNgay;
	}
	
	public int tongThanhTien(int thang, int nam){
		
	}
}
