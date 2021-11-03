import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 try {
			 System.out.println("	MENU");
			 System.out.println("1. Tên loại cà phê: Trung Nguyên");
			 System.out.println("	Giá tiền: 120.000/kg");
			 System.out.println("2. Tên loại cà phê: Moka");
			 System.out.println("	Giá tiền: 100.000/kg");
			 System.out.println();
			 
			 System.out.print("Chọn 1 loại cà phê cần mua: ");
			 int key = scanner.nextInt();
			 switch (key) {
			 case 1: {
				 System.out.println("-----------------------------");
				 System.out.println("Tên loại cà phê: Trung Nguyên");
				 System.out.println("Giá tiền: 120.000/kg");
				 System.out.println("Hoá đơn trên 500.000 được giảm giá 10%");
				 
				 try {
					 System.out.print("Nhập số ký cà phê cần mua: ");
					 double kg = scanner.nextDouble();
					 scanner.close();
					 
					 HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyên", 120000, kg);
					 System.out.println("Tổng tiền hoá đơn: " + hd.tinhTongTien());
					 double giagiam = hd.giamGia(10);
					 System.out.println("Số tiền khuyến mãi: " + giagiam);
					 System.out.println("Tổng tiền phải thanh toán: " + hd.giaSauKhiGiam(10));
					 System.out.println("Cảm ơn quý khách đã tin tưởng và ủng hộ!");
				 } catch (Exception e) {
					 // TODO: handle exception
					 System.out.println("Nhập sai dữ liệu!");
				 }
				 break;
			 }
			 case 2: {
				 System.out.println("---------------------");
				 System.out.println("Tên loại cà phê: Moka");
				 System.out.println("Giá tiền: 100.000/kg");
				 
				 try {
					 System.out.print("Nhập số ký cà phê cần mua: ");
					 double kg = scanner.nextDouble();
					 scanner.close();
					 
					 HoaDonCaPhe hd = new HoaDonCaPhe("Moka", 100000, kg);
					 System.out.println("Tổng tiền thanh toán: " + hd.tinhTongTien());
				 } catch (Exception e) {
					 // TODO: handle exception
					 System.out.println("Nhập sai dữ liệu!");
				 }
				 break;
			 }
			 default:
				 System.out.println("Bạn đã chọn sai!");
				 break;
			 }
		 } catch (Exception e) {
			 // TODO: handle exception
			 System.out.println("Lỗi! Bạn đã nhập sai kiểu dữ liệu!");
		 }
	}
}
