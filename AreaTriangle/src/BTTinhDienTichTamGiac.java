import java.util.Scanner;

public class BTTinhDienTichTamGiac {
	public static void main(String args[]) {   
	      Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Nhập chiều dài cạnh của tam giác: ");
			double canh = scanner.nextDouble();
			
			System.out.println("Nhập chiều cao của tam giác: ");
			double cao = scanner.nextDouble();
			scanner.close();
			
			double dt = (canh * cao)/2;
			System.out.println("Diện tích tam giác = "+ dt);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bạn đã nhập sai!");
		}
	}
}
