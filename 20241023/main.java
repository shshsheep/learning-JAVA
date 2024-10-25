//陣列 Arrays
//Arrayscopy
//複製

package java819.six;

import java.util.Arrays;

public class Lesson6_1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("複製前:");
		for(int x : a) {
			System.out.print(x+"\t");
		}
		System.out.println();
		System.out.println("更簡單印出陣列內容的方法"+Arrays.toString(a));
		System.out.println("複製後:");
		//system.arraycopy(來源,起始索引,目的地,起始索引,複製長度)
		System.arraycopy(a, 2, a, 4, 3);
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("==================================");
		
		//三合一
//		int score[][]= {{1,2},{55,66,77,88},{100},{99,11,55,77,100}};
		//宣告
		int score[][];
		//實體化
		score = new int [4][]; 
		score[0]= new int[2];
		score[1]= new int[4];
		score[2]= new int[1];
		score[3]= new int[5];
		//初始化 利用standard for loop 隨機產生0-100間整數亂數
		for(int m=0;m<score.length;m++) {
			for(int p=0;p<score[m].length;p++) {
				score[m][p]=(int)(Math.random()*101);
			}
		}
		//利用standard for loop印出非對稱型二維陣列的內容
		for(int m=0;m<score.length;m++) {
			for(int p=0;p<score[m].length;p++) {
				System.out.print(score[m][p]+"\t");
			}
			System.out.println();
		}
		//利用 enhanced for loop 印出 non-rectangular 的內容
		for(int x[]:score) {
			for(int y:x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
		
		System.out.println("==================================");		
		System.out.println(score.length);//4
		System.out.println(score[0].length);//2
		System.out.println(score[1].length);//4
		System.out.println(score[2].length);//1
		System.out.println(score[3].length);//5
	}

}

//---------------------------------------------------//
//Arrays.sort 
//排序

package java819.six;

import java.util.Arrays;
import java.util.Comparator;
//宣告介面用interface 的關鍵字來宣告,介面是無法實體化(new)
interface Pet{
	void move();
}
//要宣告一個類別來實作介面，並覆寫其抽象方法
class Dog implements Pet{

	@Override
	public void move() {
		System.out.println("我是實作pet介面的方法");
	}
	
}
//實作comparator 比較器來自定排序規則
class MySort implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	
	}
}

public class Lesson6_2 {
	public static void main(String[] args) {
		Dog lucky = new Dog();
		lucky.move();
		//new 一個MySort的類別物件，相當於Comparator的物件
		MySort mSort = new MySort(); 
		//宣告一個長度為10一維陣列,並隨機存入1-100間亂數
		Integer a[]=new Integer[10];
		for(int m=0;m<a.length;m++)
			a[m]=(int)(Math.random()*100);
		System.out.println("未排序前的內容為:");
		System.out.println(Arrays.toString(a));
		System.out.println("由小到大排序後的內容為:");
		Arrays.sort(a);//排序 sort
		System.out.println(Arrays.toString(a));
		System.out.println("由大到小排序後的內容為:");
		//將匿名內部類別的寫法改成lambda表達示,精簡程式的撰寫
		Arrays.sort(a,(o1,o2)->o2-o1);
//		//以匿名內部類別來實作Comparator比較器
//		Arrays.sort(a,new Comparator<Integer>(){
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//					
//		});
		System.out.println(Arrays.toString(a));
		
	}
}

//-----------------------------------------------//
//ArrayList 

package java819.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson6_3 {

	public static void main(String[] args) {
		// 
		List a = new ArrayList();
		a.add(1);
		a.add(1.23);
		Integer b[] = {1,2,3,4,5};
		System.out.println(b);
		List<Integer> c = Arrays.asList(b);//利用asList方法將陣列轉為不可改大小的集合,但可以修改內容
		//c.add(100);此行執行錯誤,因為是fixed size 固定大小,無法新增及刪除
		c.set(2,100);//此為修改,可以操作
		System.out.println(c);
	}

}