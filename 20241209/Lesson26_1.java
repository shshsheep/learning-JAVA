//package java819.twentysixth;

import java.io.File;

@SuppressWarnings("all")
public class Lesson26_1 {

	public static void main(String[] args)throws Exception {
		// public File(String pathname)
		File file = new File("abc.txt");
		File file2 = new File("d:" + File.separator + "ok" + File.separator + "abc.txt");
		File file3 = new File("d://ok//abc.txt");
		file.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		// public File(String parent,String child)
		File file4 = new File("d:\\ok", "\\test");
		// public File(File parent,String child)//父類別為File類
		File file5 = new File(file4, "ok.txt");

	}

}
