package java819.forth;

//switch -case用法


public class Lesson4_1 {

	public static void main(String[] args) {
		//byte, short, int, char, enum, String
		int menu=1;
		final int one = 1;
		switch(menu) {
		case one: //比對子只能為literal(字面值)或是常數 (final)
			System.out.println("1.新增會員");
			break;
		case 2:
			System.out.println("2.查詢會員");
			break;
		case 3:
			System.out.println("3.維護");
			break;
		default:
			System.out.println("4.選擇錯誤,即將結束");
			break;
		}
	}

}

package java819.forth;

//巢狀 if判斷

public class Lesson4_2 {

	public static void main(String[] args) {
		//巢狀
		int a = 6, b = 8, c = 3;
		// 求最大值
		if (a > b) {
			if (a > c) {
				System.out.printf("a=%d 最大\n", a);
			} else {
				System.out.printf("c=%d 最大\n", c);
			}
		} else {
			if (b > c) {
				System.out.printf("b=%d 最大\n", b);
			} else {
				System.out.printf("c=%d 最大\n", c);
			}
		}
	}

}


package java819.forth;

public class Lesson4_3 {

	public static void main(String[] args) {
	 /*
	 計數型迴圈 for loop
	 1.標準型 standard for loop 功能強大(可順著印,反著印,交替印),但程式寫的比較多,煩
	 2.加強型 enhance for loop 功能陽春(只能順著印),但程式精簡,輕鬆
	 */
	 //加強型
		int a[] = {1,2,3,4,5,6,7,8,9,10};
	 //標準型顯示陣列內容
	 //利用陣列的length屬性來取得陣列長度
		for(int m=0;m<a.length;m++)
			System.out.printf("a[%d]=%d\n",m,a[m]);
		//加強型 for-each
		//語法 for(陣列資料型態 變數名稱:陣列名稱){敘述;}
		//即為,不用管陣列的大小,編譯會自動將陣列的元素,一個一個丟給變數
		for(int b:a)
		{
			System.out.println(b);
		}
		//字串是利用length()的方法來取得字串的長度
		String b="12345678";
		System.out.println("b字串的長度為:"+b.length());
			
		System.out.println("--------------------");
			
			
	 //標準型
		for(int m=1;m <= 10; m++) //順著印
			System.out.println("m="+m);
		System.out.println("--");
		
		for(int m=10;m >= 1; m--) //逆著印
			System.out.println("m="+m);
		System.out.println("--");
		
		for(int m=1;m <= 10; m+=2) //交替印
			System.out.println("m="+m);
	}

}

package java819.forth;

public class Lesson4_4 {

	public static void main(String[] args) {
		//break,continue,label
		//break(中斷,中斷迴圈,不會在執行),continue(繼續,跳到下一個值,繼續執行)
		//break 或 continue 只會針對內迴圈有作用,若要作用在外迴圈,需使用 標籤label
		gohome:	
		for (int x = 1; x <= 10; x++) {
			System.out.printf("m=%d\t", x);
			for (int p = 1; p <= 5; p++) {
				System.out.printf("p=%d ", p);
				if (p==3) {
					break gohome;
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------");
		
		for (int m = 1; m <= 10; m++) {
			System.out.println("m="+m);
			if (m == 5) {
				break;
			}
			int a = 20;
			System.out.println(a);
		}
	 }
}