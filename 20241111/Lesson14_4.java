//package java819.forteenth;

class GrandFather {

}

class OtherGrandFathe {

}

class Father {
	
}

//java 只能單根繼承,一個子類別只能繼承一個父親,but 可以實作多個介面
//java 是類優先原則,要先繼承,而後實作
class Son extends Father implements Swin,Fly{

}

interface Swin {

}

interface Fly {

}
//因為介面為功能取向,而不是在做分類,所以介面可以繼承多個介面,but 介面是無法再實作其他介面
interface Skills extends Swin,Fly{

}

/* --------------------------------------------------- */
class Person1 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 25)
			this.age = 25;
		else
			this.age = age;
	}

}

public class Lesson14_4 {

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.setAge(30);
		System.out.println(p.getAge());
		p.setAge(12);
		System.out.println(p.getAge());

	}

}
