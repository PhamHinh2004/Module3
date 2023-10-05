package QuanLyDoanhThuXe;

public class Transformation {
	private String maChuyenXe;
	private String nameTaiXe;
	private String soXe;
	private long doanhThu;
	
	public Transformation(String maChuyenXe, String nameTaiXe, String soXe, long doanhThu) {
		this.maChuyenXe = maChuyenXe;
		this.nameTaiXe = nameTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	
	public String getMaChuyenXe() {
		return maChuyenXe;
	}


	public void setMaChuyenXe(String maChuyenXe) {
		this.maChuyenXe = maChuyenXe;
	}


	public String getNameTaiXe() {
		return nameTaiXe;
	}


	public void setNameTaiXe(String nameTaiXe) {
		this.nameTaiXe = nameTaiXe;
	}


	public String getSoXe() {
		return soXe;
	}


	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}


	public long getDoanhThu() {
		return doanhThu;
	}


	public void setDoanhThu(long doanhThu) {
		this.doanhThu = doanhThu;
	}


	@Override
	public String toString() {
		return "maChuyenXe=" + maChuyenXe + ", nameTaiXe=" + nameTaiXe + ", soXe=" + soXe
				+ ", doanhThu=" + doanhThu + "]";
	}
	
}
