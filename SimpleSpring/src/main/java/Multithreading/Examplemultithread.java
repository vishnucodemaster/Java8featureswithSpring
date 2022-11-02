package Multithreading;

//Define a thread by Runnable interface and by extending thread class

 class Examplemultithread implements Runnable {
public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
	}
}
}
 
 class Test
 {
	 public static void main(String[] args)
	 {
		 
		 Examplemultithread r = new Examplemultithread();
		 Thread t =new Thread(r);
		 t.start();
		 for(int i=0;i<10;i++) {
			 System.out.println("Main Thread");
		 }
		 
	 }
 }
