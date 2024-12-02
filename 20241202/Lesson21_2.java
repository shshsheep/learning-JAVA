//package java819.twentyfirst;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson21_2 {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		service.execute(new ThreadPool());
		service.execute(new ThreadPool2());
		service.submit(new CallTest1());
		service.shutdown();//執行完一定要關閉執行緒池,否則仍一直執行
	}

}

//1.創建一個實現Callable的實現類
class CallTest1 implements Callable<Integer> {
	@Override
//2.實作call方法,將此執行緒要做的工作撰寫於此方法中
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 100; i <= 150; i++) {
			System.out.println(Thread.currentThread().getName() + "$$:" + i);
			sum += i;
		}
		return sum;
	}
}

class ThreadPool implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + "**:" + i);
		}

	}
}

class ThreadPool2 implements Runnable {
	@Override
	public void run() {
		for (int i = 51; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "@@:" + i);
		}
	}
}
