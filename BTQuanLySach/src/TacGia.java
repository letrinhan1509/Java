
public class TacGia {
	private String tenTacGia;
	private Ngay ngaySinh;
	
	// Constructor:
	public TacGia(String tenTacGia, Ngay ngaySinh) {
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}

	// Getter and Setter:
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
}
