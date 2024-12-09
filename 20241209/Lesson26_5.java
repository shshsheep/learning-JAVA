//package java819.twentysixth;

import java.io.File;

@SuppressWarnings("all")
public class Lesson26_5 {

	public static void main(String[] args) throws Exception{
//		File f = new File("abc.txt");
//		if (!f.exists()) {
//			f.createNewFile();
//			System.out.println("檔案建立成功");
//		} else {
//			f.delete();
//			System.out.println("檔案刪除成功");
//		}

//建立資料夾
		File f = new File("aaa\\bbb\\ccc");
		if (!f.exists()) {
			if(f.mkdirs())// 嚐試改成mkdirs
				System.out.println("資料夾建立成功");
			else 
				System.out.println("發生錯誤");
		} else {
			f.delete();
			System.out.println("資料夾刪除成");
		}

	}

}
