//Arrays.stream

package java819.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson7_1 {

	public static void main(String[] args) {
		Integer a[] = {1,2,3,4,5};
		
		
		Arrays.stream(a).map(t -> "pcschool" + t).forEach(t -> System.out.print(t));
		//將匿名內部類別->轉成lamda表達式->又可將lamba表達以方法參照來取代整個lamba表達式
		
//		List<Integer> b = List.of(a);
//		System.out.println(b);
		//利用of方法所轉成的集合,是無法修改及增刪,Arrays.asList()此種方式可以修改,但不能增刪
//		b.add(100);//增加
//		b.set(1, 100);//修改
	}

}


//compare && mismatch

package java819.seven;

import java.util.Arrays;

public class Lesson7_2 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,10,4,5};
		System.out.println("compare:" + Arrays.compare(a, b));//-1
		System.out.println("mismatch:" + Arrays.mismatch(a, b));//2
		/*compare "a比b"	若a陣列內容任意數值大於b陣列的相同位置的數值,則回傳1
		 *				若b數值大於a數值,則回傳 -1
		 *				若相同陣列數值,則回傳0
		 *
		 *mismatch "a比b"若a陣列與b陣列皆為相同, 則會回傳 -1
		 *				 若a陣列與b陣列有不同的數值, 則會回傳 "第一個" 不同數值的"陣列位置"
		 *
		*/
		
		String chs[][]=new String[2][];
		chs[0]=new String[2];
		chs[1]=new String[5];
		int i=97;
		for(int c=0;c<chs.length;c++) {
			for(int d=0;d<chs.length;d++) {
				chs[c][d]=i+"";
				i++;
			}
		}
		//輸出
		for(String x[]:chs) {
			for(String y:x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
		
	}

}

//StringBuilder 

package java819.seven;

public class Lesson7_3 {

	public static void main(String[] args) {
		//String 字串 immutable,不可改變的,每次變更皆會用新的記憶體空間來放
		//StringBuilder 字串 mutable,可改變的,每次變在原記憶體位址更改
		String a=new String("ocp");
		StringBuilder b=new StringBuilder("ocp");
		System.out.println(a);
		System.out.println(b);
		//字串結合
		System.out.println("========================");
		a.concat("pass");
		System.out.println("a="+a);
		System.out.println("a.concat="+a.concat("pass"));
		//String 是不可改變的 concat後 會開一個新的記憶體存取 不會覆蓋
		System.out.println("========================");
		b.append("pass");
		System.out.println("b="+b);
		//StringBuilder 是可改變的 append後 會直接覆蓋原本內容
	}

}

//String equals equalsIgnoreCase

package java819.seven;

public class Lesson7_4 {

	public static void main(String[] args) {
		//建構字串方式
		//1.一般不會以標準物漸漸購方式(類別名稱 變數名稱=new 類別名稱())來建構字串物件
		//因為會浪費記憶體空間,除非要轉字元為字串物件,可利用標準物件建構方式來快速將字元陣列轉字串
		//2.通常會以字面值(Literal)直接指定方式來建構字串物件 例如 String a = "hello"
		//以字面方式來建構字串物件,期會放在專屬字串池(String pool)空間
		//好處為若字串內容相同,則不會再產生新空間,會有原空間,但標準建構方式,每次皆會用不同空間
		
		//a.以標準建構方式
		String a = new String("Java");
		String b = new String("Java");
		String c = new String("JaVa");
		String d = new String("Jave");
		
		//關係運算子 == 是用來判斷stack的內容是否相同,若資料為基本資料型態則是判斷內容是否相同,參考資料型態
		//則是在判斷是不是同一個物件(即記憶體是否相同)
		int x=10,y=10;
		System.out.println("x==y:"+(x==y));//true
		System.out.println("a==b:"+(a==b));//false
		//要判斷字串內容是否相同,需使用equals(有區分大小寫)方法 equalsIgnoreCase(沒有區分大小寫)
		System.out.println("a.equals(b):"+a.equals(b));//true
		System.out.println("a.equals(c):"+a.equals(c));//false
		System.out.println("a.equalsIgnoreCase(c):"+a.equalsIgnoreCase(c));//true
		System.out.println("a.equalsIgnoreCase(d):"+a.equalsIgnoreCase(d));//false
		
		System.out.println("========================================");
		
		//b.字面值方式建構字串物件
		String m = "Java";
		String p = "Java";
		System.out.println("m==p:"+(m==p));//true
		System.out.println("m.equals(p):"+m.equals(p));//true
		System.out.println("m.equalsIgnoreCase(p):"+m.equalsIgnoreCase(p));//true
		
		
	}
}

//char

package java819.seven;

public class Lesson7_5 {

	public static void main(String[] args) {
		char a[] = {'j','a','v','a'};
		int b[] = {1,2,3,4};
		System.out.println(b);
		System.out.println(a);//語法糖
		//最古老的方式,將字元陣列轉字串
		String temp="";
		for(char x:a)
			temp+=x;
		System.out.println(temp);//java
		//直接利用String標準物件建構方式來將字元陣列轉字串
		String ok=new String(a);
		System.out.println(ok);//java
		
		//陷阱!!
		
		StringBuilder m = new StringBuilder("Java");
		StringBuilder p = new StringBuilder("Java");
		//因為StringBuilder並沒有equals的方法,其是使用父類別object的equals(==)
		System.out.println("m.equals(p)="+m.equals(p));//false
		//將StringBuilder轉成字串,再調用字串的equals
		System.out.println("m.equals(p)="+m.toString().equals(p.toString()));//ture
		
	}
}




