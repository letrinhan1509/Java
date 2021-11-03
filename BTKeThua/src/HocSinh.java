
public class HocSinh extends ConNguoi {
	// Định nghĩa các thuộc tính riêng của class HocSinh:
	private String tenLop;
	private String tenTruong;
	
	// Constructor:
	public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
		super(hoVaTen, namSinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}
	// Getters and Setters:
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	
	// Method:
	public void lamBaiTap() {
		System.out.println("Hành động làm bài tập!");
	}
}
