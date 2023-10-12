package QuanliCD;

public class CD {
	private int maCd;
	private String tuaCd;
	private int soBaihat;
	private float giaThanh;
	public CD(int maCd, String tuaCd, int soBaihat, float giaThanh) throws Exception{
		setMaCd(maCd);
		setTuaCd(tuaCd);
		setSoBaihat(soBaihat);
		setGiaThanh(giaThanh);
	}
	public int getMaCd() {
		return maCd;
	}
	public void setMaCd(int maCd) {
		if(maCd > 0) {
			this.maCd = maCd;
		}else {
			this.maCd = 999999;
		}
	}
	public String getTuaCd() {
		return tuaCd;
	}
	public void setTuaCd(String tuaCd) {
		if(tuaCd.trim().compareToIgnoreCase("")==0) {
			this.tuaCd = "chua xac dinh";
		}
		else {
			this.tuaCd = tuaCd;
		}
	}
	public int getSoBaihat() {
		return soBaihat;
	}
	public void setSoBaihat(int soBaihat) throws Exception {
		if(soBaihat>0) {
			this.soBaihat = soBaihat;
		}else {
			throw new Exception ("so bai hat phai lon hon 0");
		}
	}
	public float getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(float giaThanh) throws Exception {
		if(giaThanh>0) {
			this.giaThanh = giaThanh;
		}else {
			throw new Exception("Gia thanh phai lon hon 0");
		}
	}
	@Override
	public String toString() {
		return String.format("%10d,%20s,%5d,%15f",this.maCd,this.tuaCd,this.soBaihat,this.giaThanh);
	}
}
