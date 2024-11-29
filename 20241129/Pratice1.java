//package java819.twentysecond;

import java.util.function.Consumer;

public class Pratice1 {

	public static void main(String[] args) {
		//2.建構MyCon的類別物件
		MyCon m = new MyCon();
		m.accept("java");
		//匿名內部類別寫法
		Consumer con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("順利通過:" +t);
			}
		};
		con.accept("python");

		//改寫成lambda表達式,只要是函數式介面,皆可轉為lambda表達式
		//(input ) -> {body }
		/*
		 (String t)->{System.out.println("順利通過:"+t);}; 
		 (t)->{System.out.println("順利通過:"+t);};
		 t->{System.out.println("順利通過:"+t);};
		 */
		Consumer<String> conn=t->System.out.println("通過:"+t);
		conn.accept("HTML");
		

	}
}
	//最原始的寫法
	//1.宣告類別,實作介面
	class MyCon implements Consumer<String>{

		@Override
		public void accept(String t) {
			System.out.println("通過的科目:"+t);

		}

	}