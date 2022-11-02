package Anonymous;
//Class without aany name is anonymous class
class Innerclass {
	public static void main(String[] args)
	{
		//Class that implements Runnable
	//	Runnable r = new Runnable()
		Runnable r=()->{
			//public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				//}
			}
				};
				Thread t=new Thread(r);
				t.start();
				for(int i=0;i<10;i++) {
					System.out.println("Main Thread");
				}
	}
//If anonymous inner class implements an interface that contains SAM then only we can replace that anonymous inner class with lambda expression
//Anonymous inner class can extend a normal class and also an abstract class
	//It can implement an interface which contains any number of abstract methods

}
