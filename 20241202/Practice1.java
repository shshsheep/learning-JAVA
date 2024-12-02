//package java819.twentyfirst;

import java.util.Optional;

//import org.checkerframework.checker.optional.OptionalAnnotatedTypeFactory;

public class Practice1 {
	private static Optional<Integer> convert(String a) {
		try {
			return Optional.ofNullable(Integer.parseInt(a));
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		System.out.println("Ans:" + convert("a").get());
		
//		String a1 = null;
//		String a2 = "mike";
//		String a3 = "james";
//		Optional<String> op1 = Optional.of(a2);
//		Optional<String> op2 = Optional.ofNullable(a1);
//		Optional<String> op3 = Optional.ofNullable(a3);
//		System.out.println(op1);
//		System.out.println(op2);//Optional.empty
//		System.out.println(op3);//Optional[james]
//		
//		String or1 = op3.orElse(a2);//Optional[james]
//		String or2 = op2.orElse(a3);//Optional[james]
//		//or2 是 a1 而 a1 是null 
//		//若裡面沒有值的話則調用orElse()括號內的內容
//		
//		System.out.println(or1);//james
//		System.out.println(or2);//james
	}

}
