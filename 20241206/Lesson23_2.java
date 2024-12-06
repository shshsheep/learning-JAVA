//package java819.twentythird;

import java.util.ArrayList;

//泛型不同不可以相互賦值 即泛型沒有繼承特性 但資料有繼承性
class GrandFather {}
class Father extends GrandFather {}
class Son extends Father {}
public class Lesson23_2 {
	static void call(ArrayList<GrandFather> list) {}
	public static void main(String[] args) {
		ArrayList<GrandFather> list1 = new ArrayList();
		ArrayList<Father> list2 = new ArrayList();
		ArrayList<Son> list3 = new ArrayList();
		call(list1);
		 //call(list2); //泛型沒有繼承性,無法相互賦值
		// call(list3);
		list1.add(new GrandFather());// 但資料有繼承性,同預設 Object
		list1.add(new Father());
		list1.add(new Son());

	}

}
