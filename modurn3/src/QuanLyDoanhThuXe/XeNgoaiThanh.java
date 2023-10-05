package QuanLyDoanhThuXe;

public class XeNgoaiThanh extends Transformation{
	int soTuyen;
	float kmDiDuoc;
	
	public XeNgoaiThanh(String maChuyenXe, String nameTaiXe, String soXe, long doanhThu, int soTuyen, float kmDiDuoc) {
		super(maChuyenXe, nameTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.kmDiDuoc = kmDiDuoc;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getKmDiDuoc() {
		return kmDiDuoc;
	}

	public void setKmDiDuoc(float kmDiDuoc) {
		this.kmDiDuoc = kmDiDuoc;
	}

	@Override
	public String toString() {
		return "XeNgoaiThanh [soTuyen=" + soTuyen + ", kmDiDuoc=" + kmDiDuoc + super.toString();
	}
	
}	
