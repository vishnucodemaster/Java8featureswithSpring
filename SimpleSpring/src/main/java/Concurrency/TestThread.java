package Concurrency;


class RunnableDemo implements Runnable {
	   public Thread t;
	   private String threadName;
//This suspend method puts a thread in the suspended state and can be resumed using resume() method.
	   boolean suspended = false;

	   RunnableDemo(String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );

	      try {
	         
	         for(int i = 10; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);

	            // Let the thread sleep for a while.
	            Thread.sleep(300);

	            synchronized(this) {
	               
	               while(suspended) {
//wait()
//Causes the current thread to wait until another thread invokes the notify().	            	   
	                  wait();
	               }
	            }
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	   
	   void suspend() {
	      suspended = true;
	   }
	   
	   synchronized void resume() {
	      suspended = false;
//notify()

//Wakes up a single thread that is waiting on this object's monitor
	      notify();
	   }
	}

	public class TestThread {

	   public static void main(String args[]) {
	      RunnableDemo R1 = new RunnableDemo("Thread-1");
	      R1.start();

	      RunnableDemo R2 = new RunnableDemo("Thread-2");
	      R2.start();

	      try {
	         Thread.sleep(1000);
	         R1.suspend();
	         System.out.println("Suspending First Thread");
	         Thread.sleep(1000);
	         R1.resume();
	         System.out.println("Resuming First Thread");
	         
	         R2.suspend();
	         System.out.println("Suspending thread Two");
	         Thread.sleep(1000);
	         R2.resume();
	         System.out.println("Resuming thread Two");
	      } catch (InterruptedException e) {
	         System.out.println("Main thread Interrupted");
	      } try {
	         System.out.println("Waiting for threads to finish.");
	         R1.t.join();
	         R2.t.join();
	      } catch (InterruptedException e) {
	         System.out.println("Main thread Interrupted");
	      }
	      System.out.println("Main thread exiting.");
	   }
	}