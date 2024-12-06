//package java819.twentyfourth;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lesson24_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 55, 23, 66, 33, 21, 99, 10, 8, 56);
		System.out.println("=========皆小於50======");
		boolean allMatch = list.stream().allMatch(s -> s < 50);
		System.out.println(allMatch);
		System.out.println("=========只要有小於50======");
		boolean anyMatch = list.stream().anyMatch(s -> s < 50);
		System.out.println(anyMatch);
		System.out.println("=========沒有小於50======");
		boolean noneMatch = list.stream().noneMatch(s -> s < 50);
		System.out.println(noneMatch);
		System.out.println("=========找到第一個元素======");
		Optional<Integer> findFirst = list.stream().findFirst();
		System.out.println(findFirst);
		System.out.println("=========回傳串流中數目的總數======");
		long count = list.stream().filter(s -> s >= 50).count();
		System.out.println(count);
		System.out.println("=========回傳串流中最大值======");
		Optional<Integer> max = list.stream().max(Integer::compare);
		System.out.println(max);
		System.out.println("=========回傳串流中最小值======");
		Optional<Integer> min = list.stream().min(Integer::compare);
		System.out.println(min);

	}

}
