//********** EXTENDIND THREAD CLASS ************
/*
class myThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am in RUN method..");
		}
		
	}
	
}

public class threadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread t=new myThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("I am in Main method..");
		}
	}

}
*/

//***** IMPLEMENTS RUNNABLE INTERFACE ****************
/*
class myRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am in run method..");
		}
	}
}
class threadMain
{
	public static void main(String args[])
	{
		myRunnable r1=new myRunnable();
		Thread t1=new Thread(r1);
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("I am in Main method..");
		}
	}
}
*/

//*********** GETTING AND SETTING METHOD ********
/*
class myThread extends Thread
{
	public void run()
	{
		System.out.println("Thread Name of Run method = "+Thread.currentThread().getName());
		//System.out.println("Thread Name of Run method = "+Thread.currentThread().getName());
	}
	
}

public class threadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread t=new myThread();
		t.start();
		//System.out.println(t.getName());
		
		System.out.println("Thread Name of Main method = "+Thread.currentThread().getName());
	}

}
*/

// ******** GET PRIORITY & SET PRIORITY *******
/*
class myThread extends Thread
{
	public void run()
	{
		System.out.println("Run Priority= "+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++)
		{
			System.out.println("I am in RUN method..");
		}
		
	}
	
}
public class threadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(9);
		myThread t=new myThread();
		t.start();
		t.setPriority(5);
		System.out.println("Main Priority= "+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++)
		{
			System.out.println("I am in Main method..");
		}
	}

}
*/
/*
class thread extends Thread
{
	public void run()
	{
		System.out.println("Priority is : "+Thread.currentThread().getPriority());
	}
}

class threadMain
{
	public static void main(String args[])
	{
		thread t=new thread();
		thread t1=new thread();
		thread t2=new thread();
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t.start();
		t1.start();
		t2.start();
	}
}
*/
/*
class thread extends Thread
{
	public void run()
	{
		System.out.println("running thread is : "+Thread.currentThread().getName());
	}
}

class threadMain
{
	public static void main(String args[])
	{
		thread t1=new thread();
		thread t2=new thread();
		System.out.println("t1 thread priority is : "+t1.getPriority());
		System.out.println("t2 thread priority is : "+t2.getPriority());
		t1.start();
		t2.start();
	}
}
*/
class thread extends Thread
{
	public void run()
	{
		System.out.println("running thread is : "+Thread.currentThread().getName());
	}
}

class threadMain
{
	public static void main(String args[])
	{
		thread t1=new thread();
		thread t2=new thread();
		System.out.println("t1 thread priority is : "+t1.getPriority());
		System.out.println("t2 thread priority is : "+t2.getPriority());
		t1.start();
		t2.start();
	}
}