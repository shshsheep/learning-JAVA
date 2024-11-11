package java819.forteenth;

import java.util.List;

public class Lesson14_2 {
	//	static void test(Integer[] a) {
	//	System.out.println("I am Integer Array");
	//}
	//static void test(Number[] a) {
	//	System.out.println("I am Number Array");
	//}
	static void test(Double[] a) {
		System.out.println("I am Object Array");
	}

	static void test(Object[] a) {
		System.out.println("I am Object[] ");
	}
	static void test(Object a) {
		System.out.println("I am int[] ");
	}
	static void test(Integer a) {
		System.out.println("I am Integer ");
	}
	/* ---------------------------------------------------------- */
	static void test1(int a) {
		System.out.println("i am int");
	}
	static void test1(byte a) {
		System.out.println("i am byte");
	}
	static void test1(short a) {
		System.out.println("i am short");
	}
	static void test1(Integer a) {
		System.out.println("i am Integer");
	}
	static void test1(Object a) {
		System.out.println("i am Object");
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4 };
		test(a);

		Integer b[] = new Integer[] { 11, 22, 33, 44 };
		test(b);
		//		List<int[]> of1 = List.of(a);
		//		System.out.println("of1="+of1);
		//		List<Integer> of2 = List.of(b);
		//		System.out.println("of2="+of2);

		/* ------------------------------------------------------------ */
		byte aa = 2;
		short bb = 3;
		test1(aa+bb);

	}

}
