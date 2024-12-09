//package java819.twentysixth;

import java.io.File;
import java.io.FileReader;

@SuppressWarnings("all")
public class Lesson26_9 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			// 1.File類的實體化
			File file = new File("hello.txt");
			// 2.資料流的實體化
			fr = new FileReader(file);
			// 3.資料流的操作
			int read = fr.read();
			while (read != -1) {
				System.out.print((char) read);
				read = fr.read();
			}
			System.out.println();
		} catch (Exception e) {
		} finally {
			// 4.資料流的關閉
			try {
				fr.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
