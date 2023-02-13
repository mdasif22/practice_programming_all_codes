package Java8_Features;

//typical method without lambda
class MyRunnable implements Runnable{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child method");
		}
		
	}
	
}

public class Lambda_Multithread {
	public static void main(String[] args) {
		//MyRunnable r = new MyRunnable();
		
		Runnable r = ()->{
			for(int i=0;i<5;i++) {
				System.out.println("Child method");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Parent method");
		}
	}
}
