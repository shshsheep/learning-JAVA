package java819.forteenth;
//方法多載的優先順序
//相同類別>自動轉型>包覆類別>變動參數
public class Lesson14_1 {
//	static String test(int a) {
//		return "i am int";
//	}

	static String test(double a) {
		return "i am double";
	}

	static String test(Integer a) {
		return "i am Integer";
	}

	static String test(int... a) {
		return "i am varargument";
	}
	/*-----------------------------------------*/
	//... => [] 所以 int[]... 就等於 int[][]二維陣列
	static void test20(int[]... a) {
		System.out.println("int[]...a");;
	}
	static void test20(double... a) {
		System.out.println("double...a");;
	}

	public static void main(String[] args) {
		System.out.println(test(1));
		/*------------------------------------------*/
		test20(1,2);
		//呼叫時就必須得以二維陣列的方式呼叫
		test20(new int[] {1,2,3});
		
	}
	

}

