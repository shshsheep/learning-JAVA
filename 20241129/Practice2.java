//package java819.twentysecond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Practice2 {

	public static void main(String[] args) {
		List<Integer> age =new ArrayList(List.of(1,22,3,55,35,8,50));
		
//		Comparator<Integer> com=new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return Integer.compare(o1, o2);
//			}
//		};
		
		//匿名內部類別寫法改成lambda表達式
		//有 return 時 {} 不能省略 大括號與return 相依為命 
//		Comparator<Integer> com =(o1, o2)-> {return Integer.compare(o1, o2);};
//		Comparator<Integer> com =(o1, o2)-> Integer.compare(o1, o2);
		Comparator<Integer> com=Integer::sum;//總和
		
		System.out.println(com.compare(10, 20));//-1
		System.out.println(com.compare(20, 20));//0
		System.out.println(com.compare(50, 20));//1
		
		//利用Collections集合的工具類的sort方法,來針對集合排序
		//方法參照,{body內處理的程式,剛好可以match到抽象方法,則直接可改成方法參照的寫法 類別(物件) :: 方法名稱
		Collections.sort(age,(o1,o2)-> Integer.compare(o2, o1));
		
		System.out.println(age);
		
		
		
		
//		List<String> colors = List.of("Green","Red","Blue");
//
////		Consumer con=new Consumer<String>() {
////
////			@Override
////			public void accept(String t) {
////				System.out.println(t);
////
////			}
////
////		};
////		Consumer<String> con=t->System.out.println(t);
//		
//		//轉成資料流,並利用forEach方法輸出
////		colors.stream().forEach(con);
//		colors.stream().forEach(t->System.out.println(t));
//		System.out.println("=".repeat(50));
//		colors.stream().forEach(System.out::println);
		//方法參照(Method Reference),最主要是要將整個lambda表達式取代,方法參照的運算符為:: 語法
		/*
		切記,方法參照只能寫名稱,絶對不會有小括號()或->
		物件名稱::方法名稱
		類別名稱::方法名稱
		類別名稱::new
		
		
		 */
		
	}

}
