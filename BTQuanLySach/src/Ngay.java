
public class Ngay {
	private int ngay;
	private int thang;
	private int nam;
	
	// Constructor:
	public Ngay(int ngay, int thang, int nam) {
		if(ngay > 0 && ngay <= 31) {
			this.ngay = ngay;
		} else {
			this.ngay = 1;
		}
		if(thang > 0 && thang <= 12) {
			this.thang = thang;
		} else {
			this.thang = 1;
		}
		if(nam > 0) {
			this.nam = nam;
		} else {
			this.nam = 2000;
		}
	}

	// Getter and Setter:
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		if(ngay > 0 && ngay <= 31)
			this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		if(thang > 0 && thang <= 12)
			this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		if(nam > 0)
			this.nam = nam;
	}
	
	
}
