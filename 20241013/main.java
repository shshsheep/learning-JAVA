/*
 *產出java jdk11 說明文件指令
 *
 *javadoc -d web(資料夾名稱) Person.java(檔案名稱) -private -encoding utf8
 * 
 * web 可選要產生的資料夾名稱
 * 
 * Person.java 選擇要轉換為說明文件的檔案
 * 
 * -private 將由private宣告的函式也轉換說明文件
 * 預設只有public 
 * 
 * -encoding utf8 必填 不然中文會變亂碼
 * 
*/

package java819.secend;
//一個.java檔案,可以宣告多個類別,但只能有一個類別存取權限為public
//外部類別只能宣告兩種存取權限 1.public 2.default,內部類別則四種皆可
//java 四種存取權限 public protected default(不寫) private
//void 代表此方法不能回傳任何東西,所以不能有return,若硬要加return 則需寫成 return;
public class Lesson2_1 {

	public static void main(String[] mouse) {
		//ternary 三元運算子語法 布林運算式 ? 運算式為true要執行的內容 : 運算式為假要執行的內容
		if(mouse[0].equals("ok") ? false : true) {
			System.out.println("ture");
		}else {
			System.out.println("false");
		}
		
//		for(int m=0; m < mouse.length ; m++) {
//			System.out.println(mouse[m]);
//		}
		
		System.out.println("這是程式進入點,主方法");
		//new Lesson2_1的類別物件
		Lesson2_1 kitty = new Lesson2_1();
		staticMethod();
		kitty.objectMethod();
	}
	void objectMethod(){
		System.out.println("物件,需要物件呼叫");
	}
	static void staticMethod() {
		System.out.println("static類別,可直接呼叫");
	}
}

class Animal{
	
}

/*----------------------------------------------------------------*/

package java819.secend;

public class Lesson2_2 {
//在方法外,類別內所宣告的變數為物件(沒有加static)變數或類別(static)變數
	static int staticIntVar;
	static double staticDoubleVar;
	static char staticCharVar;
	static boolean staticBooleanVar;
	static String staticStringVar;
	int objectIntVar;
	public static void main(String[] args) {
//輸出貴族區編譯器給予的預設值
		System.out.println("整數:"+ staticIntVar);
		System.out.println("福點數:"+ staticDoubleVar);
		System.out.println("字元:"+ staticCharVar);
		System.out.println("布林:"+ staticBooleanVar);
		System.out.println("字串:"+ staticStringVar);
		System.out.println("物件變數:"+ new Lesson2_2().objectIntVar);
		
		int localVar = 0;
		System.out.println("區域變數,貧民區" + localVar);
		{
			int blockVar = 0;
			System.out.println("區塊變數,貧民區" + blockVar);
		}
//		System.out.println("此行編譯錯誤,不認識區塊變數,貧民區"+blockVar);
	}

}
