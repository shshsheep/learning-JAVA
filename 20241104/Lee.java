package java819.test;

import java819.eleven.Wang;
//在不同的Package 裡面只能在不同的類別裡面呼叫 public 

public class Lee extends Wang{
//若有繼承其他的類別 則 可以呼叫他的 protected 繼承會變成別人的子類別
	int objectVar;
	public static void main(String[] args) {
		Lee a= new Lee(); //這是子類別
		a.objectVar = 200;
		Wang w = new Wang(); //這是副類別
		w.publicVar = 200;
		w.protectedVar = 300;
		a.protectedObjVar = 600;
		//類別變數,可以由物件或類別來存取,但物件變數,只能由物件來存取,無法由類別存取
		Wang.publicVar = 100;
		Wang.protectedVar = 100;
	}

}
