//package java819.nineteenth;

public class Practice3 {

	public static void main(String[] args) {
		//多重區段寫法
		//不能有繼承關西例外
		try {
//			System.out.println(10/0);
			char charAt = "1234".charAt(5);
		}catch(StringIndexOutOfBoundsException|ArithmeticException|ArrayIndexOutOfBoundsException e) {
			System.out.println("error");

//		}catch(ArithmeticException e) {
//			System.out.println("error");
//			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("error");
			
		}
	}

}
