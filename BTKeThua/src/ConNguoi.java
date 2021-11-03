
public class ConNguoi {
	private String hoVaTen;
	private int namSinh;
	
	// Constructor:
	public ConNguoi(String hoVaTen, int namSinh) {
		this.hoVaTen = hoVaTen;
		if(namSinh > 0) {
			this.namSinh = namSinh;
		} else {
			this.namSinh = 1999;
		}
	}

	// Getters and Setters:
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		if(namSinh > 0)
			this.namSinh = namSinh;
	}
	
	// Method:
	public void an() {
		System.out.println("Hành động ăn");
	}
	public void uong() {
		System.out.println("Hành động uống");
	}
	public void ngu() {
		System.out.println("Hành động ngủ");
	}
}
