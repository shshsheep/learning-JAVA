package java819.third;

public class Lesson3_1 {
	static int kitty = 666; //類別變數
	static int mickey;
	public static void main(String[] args) {
		int mickey=Lesson3_1.mickey;
		
		System.out.println(mickey);//0
		int kitty = 888;	//區域變數
		System.out.println(kitty);
		//直接利用類別來調用類別變數
		System.out.println(Lesson3_1.kitty);
		//利用物件來調用類別變數
		Lesson3_1 mike = new Lesson3_1();
		System.out.println(mike.kitty);
		
	}

}


package java819.third;

public class Lesson3_2 {
	
	public static void main(String[] args) {
		//三元運算值,若為基本資料型態,則會向上轉型
		System.out.println(10>3?5:6.0);//5.0
		
		//加法由左至右,當加法遇到字串會將前面的數結合變"字串"
		System.out.println(1+2+"4"+1+2);// "3412"
		int x=4,y=2;
		System.out.println(x+y+"=(x+y)="+x+y); // "6=(x+y)=42"
		
		final int A; //此即為常數宣告，一經指定值，即無法再更改，只能被設定一次數值
		A=100;
		
	//為了方便程式的閱讀,會加上底線_分隔數字,但_前後一定要是數字,不能為其它符號
		char a=65;
		char b=0b1000001;//2
		char c=0101;//8
		char d=0x41;//16
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	//(有加static修飾語的變數)類別變數,儲存在 global區塊,變數所有物件共同維護,類似學校的教室
	//(沒有加static修飾語的變數)物件變數,儲存在heap區塊,變數由各個物件各自獨立維護,彼此不相干
		
	//類別變數只要被宣告修改 則全部人動作 A類別宣告會影響到B類別 同理 B類別會影響到A類別
	//若物件變數有兩個類別在做宣告 則A類別宣告與B類別宣告 不相干 各做各的
		Lesson3_2 amy=new Lesson3_2();
		Lesson3_2 mike=new Lesson3_2();
		Lesson3_2.staticVar= 1000;
		
		amy.staticVar= 3333;
		mike.staticVar = 7777;
		amy.objectVar = 20000;
		mike.objectVar = 0;
		
		System.out.println("staticVar="+staticVar); //7777
		System.out.println("amy.staticVar="+amy.staticVar); //7777
		System.out.println("amy.objectVar="+amy.objectVar); //20000
		
		System.out.println("staticVar="+staticVar); //7777
		System.out.println("mike.staticVar="+mike.staticVar); //7777
		System.out.println("mike.objectVar="+mike.objectVar); //0
	}
	static int staticVar=666;
	int objectVar=999;
}
