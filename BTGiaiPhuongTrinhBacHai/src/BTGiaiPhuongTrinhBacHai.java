import java.util.Scanner;

public class BTGiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		// Phương trình: ax^2 + bx + c = 0
		double a,b,c,x1,x2,delta;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		a= scanner.nextDouble();
		System.out.println("Nhập b: ");
		b= scanner.nextDouble();
		System.out.println("Nhập c: ");
		c = scanner.nextDouble();
		scanner.close();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		if(a == 0) {
			// Không phải phương trình bậc 2
			System.out.println("Nhập dữ liệu sai!");
		} else {
			if(delta < 0) {
				// Phương trình vô nghiệm.
				System.out.println("Phương trình vô nghiệm");
			} else if(delta == 0) {
				// Phương trình có nghiệm kép: x1=x2= -b/2a
				x1 = -b/(2*a);
				System.out.println("Phương trình có nghiệm kép x1=x2= " + x1);
			} else {
				// Phương trình có nghiệm (delta >0): x1=(-b - sqrt(delta))/(2a), x2=(-b + sqrt(delta))/(2a)
				x1 = (-b - Math.sqrt(delta)) / (2*a);
				x2 = (-b + Math.sqrt(delta)) / (2*a);
				System.out.println("Phương trình có nghiệm:");
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
		}
	}
}
