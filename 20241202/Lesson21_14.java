//package java819.twentyfirst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("all")
public class Lesson21_14 {

	public static void main(String[] args) {
		// 用途在於巡訪集合中所有元素
		// 利用Collection的iterator方法返回Iterator//介面的實例
		Collection col = new ArrayList();
		col.add(123);
		col.add(true);
		col.add(new String("java"));
		col.add(new Person("amy", 25));
		Iterator iterator = col.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		// NoSuchElementsException
//		System.out.println(iterator.next());
		iterator = col.iterator();// 需重新再指定一次
		for (int m = 0; m < col.size(); m++)
			System.out.println(iterator.next());

		// System.out.println("================================");

		iterator = col.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		// 二種使用疊代器錯誤的用法
		// 方法一,會產生 NoSuchElementException,且會跳著印 會印 2,4
//		iterator = col.iterator();
//		while (iterator.next() != null)
//			System.out.println(iterator.next());
		// 方法二,要先註解上方的程式碼才可測試
		// 會產生無限循環，只印第一個元素,因為是二個不同的it
//		while (col.iterator().hasNext())
//			System.out.println(col.iterator().next());

	}

}
