
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 9, 1999);
		Ngay ngay2 = new Ngay(10, 9, 2000);
		
		TacGia tacGia1 = new TacGia("Nicholas Le", ngay1);
		TacGia tacGia2 = new TacGia("Peter Le", ngay2);
		
		Sach sach1 = new Sach("Lập trình Java", 100000, 2019, tacGia1);
		Sach sach2 = new Sach("Lập trình C++", 90000, 2019, tacGia2);
		
		sach1.inTenSach();
		if(sach1.kiemTraCungNamXuatBan(sach2)) {
			System.out.println("Năm xuất bản của sách LT Java cùng năm xuất bản LT C++");
		} else {
			System.out.println("Năm xuất bản của sách LT Java khác năm xuất bản LT C++");
		}
		
		System.out.println("Sách Lập trình Java sau khi giảm 10%: " + sach1.giaSauKhiGiam(10));
		System.out.println("Sách Lập trình C++ sau khi giảm 50%: " + sach2.giaSauKhiGiam(50));
	}
}
