//package java819.seventeenth;

public class practice2 {

	public static void main(String[] args) {


	}

}
interface Dogs{
	int legs=4;
	void run();
	//除了加上private(11),static,default
	private void aa() {

	}
	static void bb() {

	}
	default void cc() {

	}
}
class labulado implements Dogs{
	public void run() {
		System.out.println("狗會跑");

	}
}
