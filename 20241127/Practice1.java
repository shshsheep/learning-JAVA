//package java819.twentieth;

import java.util.Comparator;

public class Practice1 {

	public static void main(String[] args) {
		//利用匿名內部類別來實作Comparable介面,並覆寫其compareTo的抽象方法
		Comparable<Integer> cpr=new Comparable<Integer>() {

			@Override
			public int compareTo(Integer o) {

				return 0;
			}

		};
		//利用匿名內部類別來實作Comparator介面,並覆寫其compare的抽象方法
		Comparator<Integer> cpt=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}