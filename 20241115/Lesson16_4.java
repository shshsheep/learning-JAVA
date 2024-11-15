//package java819.sixteen;

public class Lesson16_4 {

	public static void main(String[] args) {
		Father f = new Father();
		f.speak();
		f.hello();
		System.out.println("=====================");
		Son s = new Son();
		s.speak();
		s.hello();
		System.out.println("=====================");
		//玩一下多型,virtual invoke 虛擬調用 編譯時看父類(左邊) 執行看子類(右) 若編譯時期父類並沒有相關的成員,就報錯,不用等到執行
		Father fs = new Son();
		fs.speak();
		fs.golden();
		fs.hello();
	}

}
class Father{
	void golden() {
		System.out.println("Father golden");
	}
	void speak() {
		System.out.println("Father speak");
	}
	static void hello() {
		System.out.println("Father static hello");
	}
}
class Son extends Father{
	@Override
	void speak() {
		System.out.println("Son speak");
	}
	static void hello() {
		System.out.println("Son static hello");
	}
}
