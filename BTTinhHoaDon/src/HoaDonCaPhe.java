
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	// Constructor:
	public HoaDonCaPhe(String ten, double gia, double kluong) {
		// this là lấy thông tin nội bộ bên trong class ra.
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kluong;
	}
	
	// Phương thức:
	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}
	
	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() >= 500000;
	}
	
	public double giamGia(double x) {
		if(this.kiemTraTongTienLonHon500K()) {
			return this.tinhTongTien() * (x/100);
		} else {
			return 0;
		}
	}
	
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
}
