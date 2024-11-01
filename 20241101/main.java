package java819.ten;

public class Lesson10_1 {

	public static void main(String[] args) {
		StringBuilder sb7=new StringBuilder("hello java how are you");
		//substring(begin,end) 擷取從begin到end-1的字串
		//substring 回傳為String宣告 如果沒有在前面宣告 String 則.substring無效 
		String sub = sb7.replace(2, 6, "okocp").insert(3, "pass").delete(5, 15).substring(2,5);
		System.out.println(sb7);
		System.out.println(sub);
		
		//insert(index,String)從index處插入String ,後面的字串往後移
		StringBuilder sb6=new StringBuilder("hello java how are you");
		sb6.insert(11, "ocp ");
		System.out.println(sb6);
		System.out.println("===========================");
		
		//delete(begin,end) 刪除begin到end-1的字串,end若超出索引,不會報錯,會抓最後,但begin則不行
		StringBuilder sb5=new StringBuilder("hello java how are you");
		sb5.delete(6, 10);
		System.out.println(sb5);
		System.out.println("===========================");
		
		//replace替換字串 StringBuilder 	的 replace(begin,end-1,"取代的字串") 
		//				String			的 replace(old,new)

		StringBuilder sb4=new StringBuilder("hello java how are you");
		sb4.replace(6,10,"ocppass");
		System.out.println(sb4);
		System.out.println("===========================");
		
		StringBuilder sb1=new StringBuilder(/*這裡可設定容量大小*/);
		StringBuilder sb2=new StringBuilder(6);
		StringBuilder sb3=new StringBuilder("java");
		System.out.println(sb1.capacity());//16 //預設大小為16
		System.out.println(sb1.length());//0	//沒有內容所以是0
		System.out.println(sb2.capacity());//6
		System.out.println(sb2.length());//0
		System.out.println(sb3.capacity());//6
		System.out.println(sb3.length());//0
		System.out.println("===========================");
		sb1.append("java");
		System.out.println(sb1);
		System.out.println(sb1.capacity());//16
		System.out.println(sb1.length());//4
	}

}


package java819.ten;

public class Lesson10_2 {

	public static void main(String[] args) {
		
		Integer an = 127;
		Integer bn = 127;
		Integer cn = new Integer(127);
		Integer dn = Integer.valueOf(127);
		//判斷位置是否相同
		System.out.println(an==bn);//true 記憶體位置相同
		System.out.println(an==cn);//false new產生不同的記憶體
		System.out.println(an==dn);//true 記憶體位置相同
		System.out.println(bn==dn);//true 記憶體位置相同
		//自動裝箱或是valueof方式，若數值超過範圍 127 ~ -128 則會產生新的記憶體位置，若是在範圍內則存在相同記憶體位置
		System.out.println(System.identityHashCode(an));
		System.out.println(System.identityHashCode(bn));
		System.out.println(System.identityHashCode(cn));
		System.out.println(System.identityHashCode(dn));
		
		
		//手動裝箱boxing 及 拆箱 unboxing 
		//裝箱
		Integer a = new Integer(100);
		Integer b = Integer.valueOf(100);
		//拆箱
		int c = b.intValue();
		//自動裝拆箱
		Integer d = 100;
		int e = d;
		Byte f = 10;
		Short g = 10;
		Integer h = 10;
		Long i = 10L;
		float x = 10;
		Float y = 10f;
		Double z = 10d;
		
//		System.out.println(2147483648L);
	}

}
