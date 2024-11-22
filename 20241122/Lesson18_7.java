//package java819.eighteenth;

import java.util.Arrays;

public class Lesson18_7 {

	public static void main(String[] args) {
		JavaProgram[] values = JavaProgram.values();
		System.out.println(Arrays.toString(values));
		System.out.println("=".repeat(100));
		for(JavaProgram x:values)
			System.out.println(x);
		System.out.println("=".repeat(100));
		System.out.println(JavaProgram.values()[0]);
		System.out.println(JavaProgram.JAVASE.ordinal());//0
		System.out.println(JavaProgram.JAVAME.ordinal());//2
		
		
//		System.out.println(JavaProgram.JAVAEE);
//		System.out.println(Java.SE);
	}

}
/*用來宣告已知數量之物件
使用enum關鍵字來宣告
語法 
enum 變數{
常數1,常數2.......常數n;
}*/


//自訂列舉類別--今生
enum JavaProgram {
	// 3.提共當前列舉類的多個對象
	 JAVASE ("標準版", "用於單機開發"),	 JAVAEE ("企業版", "用於伺服器開發"),	 JAVAME ("微型版", "用於行動裝置開發");
	// 1.定義物件屬性
	private final String typeName;
	private final String typeDescription;

	// 2.私有化建構子,即不可再外面再新增實體,如此才有辦法確認有限個,因為列舉是固定的已知項目,如星期,四季
	// 利用建構子來指定宣告為final屬性的值
	private JavaProgram(String typeName, String typeDescription) {
		this.typeName = typeName;
		this.typeDescription = typeDescription;
	}
	
	//初始化區塊
//	{
//		this.typeName = "typeName";
//		this.typeDescription = "typeDescription";
//	}
	


	

	@Override
	public String toString() {
		return "JavaProgram "+super.toString()+" [我是typeName=" + typeName + ", typeDescription=" + typeDescription + "]";
	}

	//	enum Java{
	//		SE,EE,ME;
	//		@Override
	//		public String toString() {
	//			return "how are you "+super.toString();
	//		}
	//	}
}

