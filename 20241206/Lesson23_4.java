//package java819.twentythird;

import java.util.List;

public class Lesson23_4 {
	class Fathera {
	}

	class Sona extends Fathera {
		
	}

	public static void main(String[] args) {
		// 有限制條件的萬用字元
		// <? extends Class> 小於等於
		// <? super Class>大於等於
		List<? extends Fathera> list1 = null;
		List<? super Fathera> list2 = null;
		List<Fathera> list3 = null;
		List<Sona> list4 = null;
		List<Object> list5 = null;
		list1 = list3;
		list1 = list4;
		// list1=list5;
		list2 = list3;
		// list2=list4;
		list2 = list5;
	}

}
