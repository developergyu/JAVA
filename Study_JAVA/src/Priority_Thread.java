
public class Priority_Thread {

	public static void main(String[] args) {
		ThreadEx11 th1 = new ThreadEx11();
		ThreadEx12 th2 = new ThreadEx12();
		
		th2.setPriority(7);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}

}

class ThreadEx11 extends Thread {
	public void run()
	{
		for(int i = 0; i < 300; i++)
		{
			System.out.print("-");
			for(int x = 0; x < 10000000; x++);
		}
	}
}

class ThreadEx12 extends Thread {
	public void run()
	{
		for(int i = 0; i < 300; i++)
		{
			System.out.print("|");
			for(int x = 0; x < 10000000; x++);
		}
	}
}