//package java819.nineteenth;

public class Practice1 {

	public static void main(String[] args) {
		m1();

	}

	static void m1() {
		try {
			m2();
		} 
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("我己經處理完了1");

		} catch (IndexOutOfBoundsException e) {
			System.out.println("我己經處理完了2");

		} catch (RuntimeException e) {
			System.out.println("我己經處理完了3");

		} finally {
			System.out.println("我無論如何皆會執行到");
			
		}
	}

	static void m2() /*throws IndexOutOfBoundsException*/ {
//		throw new IndexOutOfBoundsException();
	}

}
