package java819.eleven;
class Shirt{
	//定義類別屬性
	static int sid=10000;
	//設計物件屬性
	public int shirtID;
	public char colorCode;
	public String size;
	public double price;
	public String description;
	//建立建構子 Constructor
	public Shirt(char color,double price,String description) {
		this.colorCode=color;
		this.price=price;
		this.description=description;
	}
	//自己再產生一個像預設建構子的建構子
	Shirt(){
		System.out.println("這不叫預設建構,是長的像預設建構子的自訂建構子");
	}
	//宣告一個計算id的方法
	public int calculateShirtID() {
		return sid++;
	}
	//建立顯示資訊的方法
	public void displayInformation() {
		System.out.println("商品編號:"+shirtID);
		System.out.println("商品顏色:"+colorCode);
		System.out.println("商品尺寸:"+size);
		System.out.println("商品價格:"+price);
		System.out.println("商品描述:"+description);
	
	}
	
}
//宣告人類類別
class Person{
	//當一個類別都沒有任何建構子,編譯器會自動產生預設建構子,預設建構子,無參數,也沒有任何程式敍述,除了繼承架構下的super()
	//當您有自訂建構子時,編譯器就不會幫您產生預設建構子
	Person(int a){
		
	}
}

public class Lesson11_1 {

	public static void main(String[] args) {
		//建立Person類別物件
		Person p1 = new Person(10);
		
		//建立Shirt類別物件 語法 類別名稱 物件參考名稱(變數)=new 類別名稱();(類別名稱() 此即為無參數建構子)
		Shirt s1=new Shirt();
		//呼叫display的方法
		s1.displayInformation();
		System.out.println("=".repeat(30));
		//建立有三個參數的Shirt類別物件
		Shirt s2=new Shirt('R',2000,"秋冬最新款");
		s2.displayInformation();
		
		
		
		int a=127,b,c; //最高127
		b=c=a;
		System.out.println(a==b);//true
		var x=System.identityHashCode(a);
		var y=System.identityHashCode(b);
		System.out.println(x==y);//true	
		System.out.println("a="+System.identityHashCode(a));
		System.out.println("b="+System.identityHashCode(b));
		System.out.println("c="+System.identityHashCode(c));
	}

}
