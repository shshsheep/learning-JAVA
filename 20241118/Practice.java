//package java819.seventeenth;

//import java819.seventeenth.Animal;
//import java819.seventeenth.Cat;
//import java819.seventeenth.Tiger;

public class Practice {

	public static void main(String[] args) {
		
//		Tiger t = new Tiger();
//		t.skill();
//		t.move();
//		Cat c = new Tiger();
//		c.skill();
//		c.move();
		Animal a = new Tiger();
		((Cat)a).skill();
		a.move();

	}
	
}

class Animal{
	public void move() {
		System.out.println("我是Animal");
	}
}
class Bird extends Animal{
	@Override
	public void move() {
		System.out.println("我是Bird");
	}
}
class Cat extends Animal{
	@Override
	public void move() {
		System.out.println("我是Cat");
	}
	public void skill() {
		System.out.println("我是Cat的SKILL");
	}
}
class Tiger extends Cat{
	@Override
	public void skill() {
		System.out.println("我是Tiger skill");
	}
}
