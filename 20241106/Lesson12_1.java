package java819.twelve;

class Exam{
	//宣告物件變數,若是常數,則需要給初始值,而且給初始值可以在建構子設定,或是初始化區塊(initial block)設定
	//若在建構子設定,因為不知道使用者到底要調用那一個建構子,所以每個建構子一定要有程式來設定常數的值
	//但若是在初始化區塊,只需要在初始化區塊設定即可,不能在建構子重複設定,因為初始化區塊的內容會複製到每個建構子
	final double age;
	//物件初始化區塊
	{
		age = 120;
	}
	Exam(String a){
//		this(Double.parseDouble(a));
		System.out.println("這是字串型態的建構子 :" + age);
	}
	Exam(double a){
//		this.age = a;
		System.out.println("這是浮點數型態的建構子 :" + age);	
	}
	Exam(){
//		this(Double.parseDouble(a));
		System.out.println("這是無參數的建構子 :" + age);
	}

}

class Test{
	String name;
	Test(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

abstract class Father{
	 abstract void impossible();
}

class Son extends Father{
	
	@Override
	void impossible() {
		
	}
	
}
interface Pet{
	/*public static final*/ int age = 15;
	//在interface 裡面 不可以用 protected 做宣告
}
public class Lesson12_1 {
	final int age = 15; 
	public class A{}
	void hello(int...a) { // a 為一個陣列
		System.out.println("變動參數");
		for(int x:a) {
			System.out.println(x);
		}
	}
//		void hello(int a,int b) {
//			System.out.println("兩個參數");
//		}
//		void hello(int a,int b,int c) {
//			System.out.println("三個參數");
//		}
//		void hello(int a,int b,int c,int d) {
//			System.out.println("四個參數");
//		}

	public static void main(String[] args) {
        new Lesson12_1().hello(1,2,3,4,5,6);
		Test t = new Test("Student");
		System.out.println(t);

		final int z = 110;

		Exam a = new Exam("1.23");
		System.out.println("=========================");
		Exam b = new Exam(1.23);
		System.out.println("=========================");
		Exam c = new Exam();
		System.out.println("=========================");


	}

}