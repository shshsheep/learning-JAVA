//package java819.eighteenth;

class SomeBody{
	int a;
	static int Staticb;
	SomeBody(int b){
		a = 500;
	}
	SomeBody(){
		a = 600;
	}
	//物件初始化區塊,可初始化類別變數與物件變數
	{
		a = 100;
		Staticb = 500;
	}
	//類別初始化區塊，只能初始化類別變數
	static {
//		a = 100; 無法初始化 他是物件不是類別
		Staticb = 500;
	}
}

public class Lesson18_9 {

	public static void main(String[] args) {
		
		SomeBody s1 = new SomeBody();
		System.out.println(s1.a);//600
		SomeBody s2 = new SomeBody(1);
		System.out.println(s2.a);//500
//		System.out.println(Letter.values()[1]);
		Hello b=new Hello();

//		System.out.println(b);

	}

}

class Hello{


	@Override
	public String toString() {
		return "i am hello"+String.valueOf(new Hello());
	}

}

enum Letter{
	ALPHA(100),BETA(200),GAMMA(300);
	int v;
	Letter(int v){
		this.v=v;
	}
	public String toString() {
		//		return String.valueOf(ALPHA.v);
		//		return String.valueOf(Letter.values()[1]);
		//		return String.valueOf(v);
		return "200";
	}
}