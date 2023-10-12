package QuanliCD;

import java.util.Arrays;
import java.util.Comparator;

public class CDlist {
	private static final int Comparator = 0;
	CD cd[];
	int count = 0;
	public CDlist(int ptu) {
		cd = new CD[ptu];
	}
	public void addCD(CD cd_temp) throws Exception{
		if(count<this.cd.length) {
			this.cd[count] = cd_temp;
			count++;
		}
		else {
			throw new Exception("Da tran bo nho khong them vao duoc");
		}
	}
	public int soLuongCD() {
		return count;
	}
	public float tinhTongGiaThanh() {
		float sumGiaThanh = 0;
		for(int i=0;i<this.count;i++) {
			sumGiaThanh+=cd[i].getGiaThanh();
		}
		return sumGiaThanh;
	}
	public void thongTinTrongDanhSachCD() {
		for(int i=0;i<this.count;i++) {
			System.out.println(cd[i].toString());
		}
	}
	public void timKiemTheoMa(int maValues) {
		for(int i = 0;i<this.count;i++) {
			if(cd[i].getMaCd()==maValues) {
				System.out.println("Co tim thay ma !!!!");
				System.out.println(cd[i].toString());
				return;
			}
		}
		System.out.println("Khong tim thay ma!!!!!");
	}
	public void sapXepGiamDanTheoGiaThanh() {
		Arrays.sort(cd,new Comparator<CD>() {

			@Override
			public int compare(CD o1, CD o2) {
				if(o1.getGiaThanh()>o2.getGiaThanh()) {
					return 1;
				}
				else if(o1.getGiaThanh()>o2.getGiaThanh()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
	}
	public void sapXepTangDanTheoTuaCD() {
		Arrays.sort(cd,new Comparator<CD>() {

			@Override
			public int compare(CD o1, CD o2) {
				if(o1.getTuaCd().trim().compareToIgnoreCase(o2.getTuaCd().trim()) >0) {
					return 1;
				}
				else if(o1.getTuaCd().trim().compareToIgnoreCase(o2.getTuaCd().trim()) <0) {
					return -1;
				}
				else {
					return 0;
				}
			}
			
		});
	}
	
}
