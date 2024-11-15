//package java819.sixteen;

public class Lesson16_2 {

	public static void main(String[] args) {
		Person p = new Person();
		Japanese j = new Japanese();
		Taiwanese t = new Taiwanese();
		speakLanguage(j);
		speakLanguage(p);
		speakLanguage(t);
		
	}
	//不會多型的寫法前,要用方法overloading來達到效果
	static void speakLanguage(Person p) {
		p.speak();
	}
//	static void speakLanguage(Taiwanese p) {
//		p.speak();
//	}
//	static void speakLanguage(Japanese p) {
//		p.speak();
//	}
}

class Person{
	void speak() {
		System.out.println("我是人類,我會講話");
	}
}
class Japanese extends Person{
	@Override
	void speak() {
		System.out.println("我是日本人,我會講日語");
	}
}
class Taiwanese extends Person{
	@Override
	void speak() {
		System.out.println("我是台灣人,我會講台語");
	}
}
