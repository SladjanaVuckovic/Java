package implementsRunnable;

public class B implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println(Thread.currentThread().getName());
	}

}
