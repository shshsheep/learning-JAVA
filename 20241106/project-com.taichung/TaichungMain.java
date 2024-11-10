//package com.taichung.computer;

//import com.taipei.service.HelloKitty;

public class TaichungMain {

	public static void main(String[] args) {
		HelloKitty cat = new HelloKitty();
		System.out.println(cat);
		
	}

}


/*module-info.java 內 */

//module com.taichung {
//	//此模組需要取得另一個模組的資源需使用 requires 關鍵字來 require 
//	//require 後面接的是模組名稱
//	requires com.taipei;	
//}