package HangHoa;

public class HangHoa {
	private String maHang ;
	private String tenHang;
	private float donGia;
	private int soLuongTon;
	public HangHoa(String maHang, String tenHang, float donGia, int soLuongTon) throws Exception{
		setTenHang(tenHang);
		setMaHang(maHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) throws Exception{
		if(this.donGia>=0) {
			this.donGia = donGia;
		}
		else{
			this.donGia = 0;
		}
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws Exception{
		if(this.soLuongTon>=0) {
			this.soLuongTon = soLuongTon;
		}else {
			this.soLuongTon = 0;
		}
	}
	@Override
	public String toString() {
		return "HangHoa [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", soLuongTon="
				+ soLuongTon + "]";
	}
	
}
