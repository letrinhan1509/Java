
public class Main {
	public static void main(String[] args) {
		// Ví dụ về đơn kế thừa:
		System.out.println("Ví dụ về đơn kế thừa:");
		ConNguoi cng = new ConNguoi("Nicholas Le", 1999);
		cng.an();
		cng.uong();
		cng.ngu();
		
		HocSinh hs = new HocSinh("Nicholas Le", 1999, "Đại Học", "ĐH CNSG");
		hs.an();
		hs.ngu();
		hs.lamBaiTap();
		
		// Ví dụ về kế thừa đa cấp:
		System.out.println("");
		System.out.println("Ví dụ về kế thừa đa cấp:");
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		
		BabyDog bbdog = new BabyDog();
		bbdog.eat();
		bbdog.bark();
		bbdog.weep();
		//bbdog.setName("Husky");
		System.out.println(bbdog.getName());
		
		// Ví dụ về kế thừa thứ bậc:
		System.out.println("");
		System.out.println("Ví dụ về kế thừa thứ bậc:");
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
	}
}
