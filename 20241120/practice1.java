//package java819.eighteenth;

interface Fish{}
public class practice1 {
	//內部類別產生class的命名方式
	
	//一般內部類別如同物件變數,可加四種存取權限 public protected 唸default private
	//靜態內部類別如同類別變數,可加四種存取權限 public protected 唸default private
	
	//一般內部類別
//	public 		class 	Iner1{}
	protected	class 	Inner2{}
	class 				Inner3{}
	private 	class 	Inner4{}
	
	//靜態內部類別
	public   	static 	class StaticInner1{}
	protected 	static 	class StaticInner2{}
	static 				class StaticInner3{}
	private 	static 	class StaticInner4{}
	
	//方法內部類別,可在方法內,建構子內,初始化區塊內宣告,如同區域變數,宣告有上下順序,需先宣告才可呼叫,也不能加上存取權限及static
	void test() {
		Iner1 in1=new Iner1();
	}
	
	//Constructor
	practice1(){
		class ConstructorClass{}

	}
	
	//初始化區塊 initial block
	{
		class InitialClass{}
		class MethodClass1{}
	}
	
	void method() {
		class MethodClass1{}
		MethodClass1 mb=new MethodClass1();
	}

	public static void main(String[] args) {
		//匿名內部類別 Anonymouse 即沒有類別的名稱的類別
		new Fish() {
			
		};
		new Fish() {

		};
	}
	public class Iner1{
		class Iner1Again{}
	}

}
