
public class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}
	public Bird() {
		super("owl");
	}
	
	public void fly() {
		System.out.println("I'm flying");
	}
}
