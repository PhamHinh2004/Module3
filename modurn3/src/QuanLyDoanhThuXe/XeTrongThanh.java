package QuanLyDoanhThuXe;

public class XeTrongThanh extends Transformation{
	String noiDen;
	int soNgay;
	
	public XeTrongThanh(String maChuyenXe, String nameTaiXe, String soXe, long doanhThu, String noiDen, int soNgay) {
		super(maChuyenXe, nameTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	@Override
	public String toString() {
		return "XeTrongThanh [noiDen=" + noiDen + ", soNgay=" + soNgay + super.toString();
	}
}	
