package java819.eight;

public class Lesson8_2 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		
		StringBuilder s5 = new StringBuilder("Java");
		StringBuilder s6 = new StringBuilder("Java");
		
		System.out.println("判斷記憶體位置是否相同 s1 == s2 "+(s1 == s2)); //false
		System.out.println("判斷記憶體位置是否相同 s3 == s4 "+(s3 == s4)); //true
		System.out.println("判斷字串內容是否相同 s1.equals(s2) " +s1.equals(s2));//true
		System.out.println("判斷字串內容是否相同 s3.equals(s4) " +s3.equals(s4));//true
		
		
		//object的equals是判斷記憶體位置的(==)  
		System.out.println("s5.equals(s6) " +s5.equals(s6));//調用object的equals 結果為false
		System.out.println("s5.equals(s6) " +s5.toString().equals(s6.toString()));//調用String的equals 結果為true
		//從StringBuilder轉換成String(.toString)再去做equals的判斷 這樣就是在判斷字串內容
		
	}

}


package java819.eight;

public class Lesson8_1 {

	public static void main(String[] args) {
		//啟動/關閉多欄編輯 shift+alt+A
		// 字串常用方法
		
		//結合轉換類型
		//1.intern()此方法會先去string pool找有無相同內容,若有則將此內容的記憶體位址回傳,若沒有,則在
		//String pool建立新內容,再回傳此新內容的位址
		String aa="java";
		String cc=aa.intern();
		String xx=new String("JAVA");
		String yy=xx.intern();
		String zz=xx.intern();
		System.out.println("aa==cc:"+(aa==cc));//true 判斷位址
		System.out.println("aa.equals(cc):"+(aa.equals(cc)));//true 判斷內容
		System.out.println("xx==yy:"+(xx==yy));//false 判斷位址
		System.out.println("xx.equals(yy):"+(xx.equals(yy)));//true 判斷內容
		System.out.println("yy==zz:"+(yy==zz));//true 判斷位址
		System.out.println("xx.equals(yy):"+(xx.equals(yy)));//true 判斷內容
		//查看變數的記憶體位址
		System.out.println("aa address:"+System.identityHashCode(aa));
		System.out.println("cc address:"+System.identityHashCode(cc));
		System.out.println("xx address:"+System.identityHashCode(xx));
		System.out.println("yy address:"+System.identityHashCode(yy));
		System.out.println("zz address:"+System.identityHashCode(zz));
		System.out.println("=====================");
		
		//2.concat 結合字串 ,跟 +運算相同,但+可結合null值,concat無法,會產生NullPointerException
		String acc="hello";
		String bcc=null;
		System.out.println(acc.concat("java"));//hellojava
		System.out.println(acc+"java");//hellojava
		System.out.println(bcc+"java");//nulljava
		//System.out.println(bcc.concat("java"));//NullPointerException
		System.out.println("=====================");
		
        //----------------------------------------------------------------------------//

		//判斷類型
		//1.isBlank(只要是空的,包含空白" ",\t) isEmpty(只要空字串""才為true) 判斷字串是否為空字串
		String a="";
		String b=" ";
		String c="\n";
		String d="\t";
		System.out.println(a.isEmpty());//true
		System.out.println(b.isEmpty());//false
		System.out.println(c.isEmpty());//false
		System.out.println(d.isEmpty());//false
		System.out.println("=====================");
		System.out.println(a.isBlank());//true
		System.out.println(b.isBlank());//true
		System.out.println(c.isBlank());//true
		System.out.println(d.isBlank());//true
		System.out.println("=====================");
		
		//2.equals(分大小寫) equalsIgnoreCase(不分大小寫)
		String g="java";
		String h="java";
		String j="jAvA";
		System.out.println(g.equals(h));//true
		System.out.println(g.equals(j));//false
		System.out.println(g.equalsIgnoreCase(j));//true
		System.out.println("=====================");
		
		//3.判斷是否包含某字串 contains ,是否為某字串為起始字串 startsWith,某字串為結束字串 endsWith
		String z="http://www.pcschool.com.tw";
		System.out.println(z.contains("com"));//true
		System.out.println(z.contains("edu"));//false
		System.out.println(z.startsWith("http://"));//true
		System.out.println(z.startsWith("telnet://"));//false
		System.out.println(z.endsWith("tw"));//true
		System.out.println(z.endsWith("jp"));//false

	}

}
