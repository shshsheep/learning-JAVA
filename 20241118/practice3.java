//package java819.seventeenth;

public class practice3 {

	public static void main(String[] args) {
//		Fish f = new Fish();
//		Shark s = new Shark();
//		s.swim();
		
		//以匿名內部類別來實作介面
		Fish f = new Fish() {

			@Override
			public void swim() {
				System.out.println("沒有名稱的類別");
				
			}
			
		};
		f.swim();
	}

}
interface Fish{
	void swim();
}

//傳統方式 宣告一個類別來實作介面
//class Shark implements Fish{
//
//	@Override
//	public void swim() {
//		System.out.println("沙魚會游泳");
//		
//	}
//	
//}
