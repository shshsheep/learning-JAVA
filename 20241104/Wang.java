package java819.eleven;
class Chen{
	void test() { //同一個package可以存取 public protected default
		Wang.publicVar = 55;
		Wang.protectedVar = 66;
		Wang.defaultVar = 77;
		//Wang.privatedVar = 100; 只有在自己的類別呼叫 (Wang)
		
	}
}

//類別宣告如果是public 則可以給大家呼叫
//類別宣告如果是protected 則原則上是給同一個package做呼叫 但!! 若不同package的類別有做繼承(extend) 則可以呼叫
//類別宣告如果是default 則可以給同一個package做呼叫
//類別宣告如果是private 則只能自己類別使用


public class Wang {
	//宣告四種不同存取權限的類別變數
	protected int protectedObjVar = 5;
	static private int privateVar = 1;
	static int defaultVar = 2;
	static protected int protectedVar = 3;
	static public int publicVar = 4;

	public static void main(String[] args) {
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
		
	}

}
