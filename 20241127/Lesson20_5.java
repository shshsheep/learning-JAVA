//package java819.twentieth;

import java.util.Arrays;
import java.util.Comparator;

public class Lesson20_5 {

	public static void main(String[] args) {
		String color[] = {"mike", "amy", "zoe", "tom", "james"};
        //預設由小到大
        Arrays.sort(color);
        System.out.println(Arrays.toString(color));
        //利用匿名類別改寫排序準則
        Arrays.sort(color, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("=====由大到小排序====");
        System.out.println(Arrays.toString(color));


	}

}
