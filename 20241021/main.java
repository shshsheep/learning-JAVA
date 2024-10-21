//do while,while迴圈

package java819.five;

import java.util.Scanner;

public class Lesson5_1 {
		//class member 類別成員
		int a = 100;//物件變數,field,attributes

	public static void main(String[] args) {
		//費氏數列
		Scanner sc= new Scanner(System.in);
		System.out.println("輸入最大值 :");
		int max = sc.nextInt();
		int no1=1,no2=1,no3=no1+no2;
		System.out.print("1\t1");
		while(no3<=max) {
			System.out.print("\t"+no3);
			no1=no2;
			no2=no3;
			no3=no1+no2;
		}
		
		int sorce= 80;
		//前測條件迴圈
		while(sorce >= 60) {
			System.out.println("及格");
			break;
		}
		//後側條件迴圈
		do {
			System.out.println("及格2");
			sorce--;
			break;
		}while(sorce >= 60);
		
	}

}


//Array 陣列

package java819.five;

public class Lesson5_2 {
	
	public static void main(String[] args) {
		//陣列
		//宣告+實體化+初始化
//		int score[] = new int[] {100,80,60} ;
		int score[] = {100,60,80};
		//實體化
//		score = new int[3];
		//初始化
//		score[0] = 100;
//		score[1] = 60;
//		score[2] = 80;
		//印出陣列內容 enhanced for loop
		for (int x:score)
			System.out.println(x);
		
		//二維陣列
		int []app[] = {{11,22,33,44},{55,66,77,88}};
		System.out.println(app[0][0]);//11
		System.out.println(app[0][2]);//33
		System.out.println(app[1][2]);//77
		//利用standard for loop 印出二維陣列內容
		//利用陣列的length的屬性來求得陣列長度
		System.out.println("app長度,即第一維"+app.length);
		System.out.println("app[0]長度,即第二維"+app[0].length);
		for (int a=0; a<2; a++) {
			for (int b=0; b<4; b++) {
				System.out.printf("app[%d][%d]=%d\t",a,b,app[a][b]);
			}
			System.out.println();
		}
		//利用加強型 enchanced for loop印出二維陣列內容
		/*
		 * 11 22 33 44
		 * 55 66 77 88
		 */
		//第一維
		for(int[] x:app) {
            //第二維
			for(int y:x) {
				System.out.printf(y+"\t");
			}
			System.out.println();
			
		}
		
	}
	
}

