//package java819.twentysixth;

import java.io.File;
import java.io.FileReader;

@SuppressWarnings("all")
public class Lesson26_8 {

	public static void main(String[] args)throws Exception {
		// 建立hello.txt檔案時需在files面板中建立,路徑為相對於專案
		// 1.File類的實體化
		File file = new File("hello.txt");
		// 2.資料流的實體化
		FileReader fr = new FileReader(file);
		// 3.資料流的操作
		int read = fr.read();
		while (read != -1) {
			System.out.print((char) read);
			read = fr.read();
		}
		System.out.println();
		// 4.資料流的關閉
		fr.close();

	}

}
