package HangHoa;

import java.time.LocalDate;

public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh;
	private float congSuat;
	public HangDienMay(String maHang, String tenHang, float donGia, int soLuongTon, int thoiGianBaoHanh,
			float congSuat) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		this.setThoiGianBaoHanh(thoiGianBaoHanh);
		this.setCongSuat(congSuat);
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) throws Exception{
		if(thoiGianBaoHanh>=0) {
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		}
		else {
			this.thoiGianBaoHanh = 0;
		}
	}
	public float getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(float congSuat) throws Exception{
		if(congSuat>=0) {
			this.congSuat = congSuat;
		}else {
			this.congSuat = 0;
		}
	}
	
}
