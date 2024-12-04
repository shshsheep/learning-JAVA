//package java819.twentythird;

import java.util.ArrayList;
import java.util.List;

public class Lesson23_1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setSexT(123);// 此時為Object型別
		Person<String> p1 = new Person();
		p1.setSexT("123");// 此時必需為字串型別才可輸入
		SubPerson sp = new SubPerson();// 子類別因繼承父類別,不用再宣告
		
//測試泛型方法
		String test[] = { "hello", "ok", "kitty" };
		Person<String> p3 = new Person<String>();
		List<String> arrayToList = p1.arrayToList(test);
		Integer test1[] = { 1, 2, 3, 4, 5, 6 };
		Person<String> p2 = new Person<String>();
		List<Integer> arrayToList2 = p2.arrayToList(test1);
		System.out.println(arrayToList);
		System.out.println(arrayToList2);

	}

}

class SubPerson extends Person<Integer> { // 因繼承父類即可使用泛型
}

class Person<T> {
	int age;
	String name;
	T sexT;

	public Person() {
	}

	public Person(String name, int age, T sexT) {
		this.name = name;
		this.age = age;
		this.sexT = sexT;
	}

	public void setSexT(T sexT) {
		this.sexT = sexT;
	}

	public T getSexT() {
		return sexT;
	}

	@Override
	public String toString() {
		return "Person{" + "age=" + age + ", name=" + name + ", sexT=" + sexT + '}';
	}

//泛型方法,跟上面的類別泛型無關
	public <E> List<E> arrayToList(E[] arr) {
		ArrayList<E> ls = new ArrayList<>();
		for (E x : arr)
			ls.add(x);
		return ls;
	}
}
