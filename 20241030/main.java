package java819.nine;

import java.util.Arrays;
import java.util.stream.Stream;

public class Lesson9_1 {

	public static void main(String[] args) {
		//結合轉換類型
		//3.lines計算字串的行數
		String a="hello \n java \n how \n are \n you";
		Stream<String> lines = a.lines();
		//將stream利用forEach終端操作輸出
		lines.forEach(System.out::print);
		System.out.println();
		//印出stream內元素的數目
		lines = a.lines();
		System.out.println(lines.count());//5
		
		//4.repeat(n) 將字串重覆幾次
		String b="ocp819 pass ";
		System.out.println(b.repeat(5));
		
		//5.replace(old,new)以new字串置串所有old字串
//		String c="hello java how are you ,long time no see";
		String c="hello java ok";
		c=c.replace("o", "good");
		System.out.println(c);
//		a=a.replace("o", "good");
		System.out.println(c.replace("h", "xxx"));
		
		//6.split("分隔符號")將字串以分隔符號分割,回傳為字串陣列型態
		String d="red,green,blue,cyan,magenta,yellow";
		String[] split = d.split(",");
		System.out.println(Arrays.toString(split));
		
		//7.刪除前後空白 trim() 新的strip()針對全形的空白也有作用
		String e=" xyz ";
		String f="　xyz　";
		System.out.println("head:"+e.trim()+":tail");
		System.out.println("head:"+f.trim()+":tail");//全行空白沒有辦法
		System.out.println("head:"+e.strip()+":tail");
		System.out.println("head:"+f.strip()+":tail");
		
		//8.刪除前面空白 stripLeading,刪除後面空白 stripTrailing
		String g=" xyz ";
		System.out.println("head:"+g.stripLeading()+":tail");
		System.out.println("head:"+g.stripTrailing()+":tail");
		
		//9.將字串轉成字元陣列
		String h="javaocp";
		char[] i = h.toCharArray();
		System.out.println(i);
		//將i的字元陣列轉成字串
		String j = Arrays.toString(i);
		System.out.println(j);
		String k=new String(i);
		System.out.println("k="+k);
		
		//結合轉換類型
		//10.toLowerCase()轉小寫
		//11.toUpperCase()轉大寫
		//12.將數值轉字串 類別方法 String.valueOf(數值)
		//13.將字串轉數值 利用包覆類別的 parseXXX 例 Integer.parseInt(字串)
		String l="Java Ocp";
		System.out.println(l.toLowerCase());
		System.out.println(l.toUpperCase());
		String m = String.valueOf(12.34);
		System.out.println(m);
		System.out.println(String.valueOf(1234)+String.valueOf(5678));//12345678
		System.out.println(Integer.parseInt("1234")+Integer.parseInt("5678"));//6912
	}

}


package java819.nine;

public class Lesson9_2 {

	public static void main(String[] args) {
		//比較擷取類型
		//1.compareTo 依ascii 值比較二個字串是否相同,若相同則傳回0,不同則傳回其ascii差值
		//2.compareToIgonoreCase 不區分大小寫 依ascii 值比較二個字串是否相同,若相同則傳回0,不同則傳回其ascii差值
		String a="java";
		String b="java";
		String c="jAvA";
		System.out.println(a.compareTo(b));//0
		System.out.println(a.compareTo(c));//32
		System.out.println(c.compareTo(a));//-32
		System.out.println(c.compareToIgnoreCase(a));//0
		
		//3.charAt擷取字元,charAt(index) 回傳index的字元,若索引超出範圍會報錯
		String d="javaocppass";
		char e = d.charAt(5);//c
		System.out.println(e);
//		System.out.println(d.charAt(15));//StringIndexOutOfBoundsException
		
		//4.indexOf()回傳第一個符合的字串索引值,若找不到則回傳-1
		//5.lastIndexOf()回傳取後一個符合的字串索引值,若找不到則回傳-1
		String f="java hello how are you";
		System.out.println(f.indexOf("o"));//9
		System.out.println(f.indexOf("z"));//-1
		System.out.println(f.lastIndexOf("o"));//20
		System.out.println(f.lastIndexOf("Z"));//-1
		
		//6.substring 擷取子字串
		//substring(begin)從begin擷取到最後
		//substring(begin,end)從begin擷取到end-1的字串
		String g="123456789";
		System.out.println(g.substring(2));//3456789
		System.out.println(g.substring(2,8));//345678
//		System.out.println(g.substring(10));
		System.out.println(g.length());//9
	}

}


package java819.nine;

import java.time.LocalDateTime;

public class Lesson9_3 {

	public static void main(String[] args) {
		String name="james";
		int age=25;
		boolean gender=true;
		System.out.printf("我的名字叫 %s,今年: %d歲,我的性別是:%s\n",name,age,gender?"男生":"女生");
		String a=String.format("我的名字叫 %s,今年: %d歲,我的性別是:%s",name,age,gender?"男生":"女生");
		System.out.println(a);
		
		System.out.printf("變數1=%d,變數2=%d\n",1,2);
		System.out.printf("變數1=%d,變數2=%<d\n",1);
		System.out.printf("變數1=%3$d\n",1,2,3);
		
		LocalDateTime c=LocalDateTime.now();
		System.out.printf("%td\n",c);
		System.out.printf("%tm\n",c);
		System.out.printf("%ty\n",c);
		System.out.printf("%tY\n",c);
		System.out.printf("%tF\n",c);
		System.out.printf("%tT\n",c);
		System.out.printf("%tH\n",c);
	}

}


