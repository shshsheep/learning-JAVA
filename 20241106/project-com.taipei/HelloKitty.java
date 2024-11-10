//package com.taipei.service;

public class HelloKitty {

	@Override
	public String toString() {
		return "我是台北提供的資源類別";
	}

}



/*module-info.java 內 */

//module com.taipei {
//	exports com.taipei.service to com.taichung, com.tainan;
//	//exports 後面接的是套件的名稱 to 後面接的是模組名稱,可多個,以逗號分開
//}