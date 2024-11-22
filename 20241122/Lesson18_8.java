//package java819.eighteenth;

import java.util.Arrays;


public class Lesson18_8 {

	public static void main(String[] args) {
		

	}

}
class JavaProgram1 {
	// 1.定義物件屬性
	private final String typeName;
	private final String typeDescription;

	// 2.私有化建構子,即不可再外面再新增實體,如此才有辦法確認有限個,因為列舉是固定的已知項目,如星期,四季
	// 利用建構子來指定宣告為final屬性的值
	private JavaProgram1(String typeName, String typeDescription) {
		this.typeName = typeName;
		this.typeDescription = typeDescription;
	}

	// 3.提共當前列舉類的多個對象
	public static final JavaProgram1 JAVASE = new JavaProgram1("標準版", "用於單機開發");
	public static final JavaProgram1 JAVAEE = new JavaProgram1("企業版", "用於伺服器開發");
	public static final JavaProgram1 JAVAME = new JavaProgram1("微型版", "用於行動裝置開發");

	// 4.取得列舉物件的屬性
	public String getTypeName() {
		return typeName;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	@Override
	public String toString() {
		return "JavaProgram1 [typeName=" + typeName + ", typeDescription=" + typeDescription + "]";
	}

}
