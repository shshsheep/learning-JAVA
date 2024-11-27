//package java819.nineteenth;

public class Practice2 {

	public static void main(String[] args) {
		// understand 例外訊息輸出的方式
		// 1.最精簡 getMessage() 回傳()內的文字,若沒有則為null
		//2.次精簡 toString()
		//3.完整 .printStackTrace()
		try {
			test();
		} catch (HelloException e) {
//			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

	static void test() throws HelloException {
		throw new HelloException();
	}

}

//自訂例外類別
class HelloException extends Exception {
	HelloException() {
	}

	HelloException(String msg) {
		super(msg);
	}

}
