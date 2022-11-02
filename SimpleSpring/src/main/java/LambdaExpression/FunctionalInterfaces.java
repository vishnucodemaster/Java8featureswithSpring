package LambdaExpression;
//It should contains single abstract method(SAM)


//One abstract method but any number of staic and default method can be there

@FunctionalInterface
interface  FunctionalInterfaces {

	public void m1();
	
	default void m2() {
		
	}
public static void m3() {
	
}
}

interface A{
	public void m7();
}
//It should contains exactly one abstract method
//It can contains any number of default and static method
// It acts as a type for lambda 
//It is used to invoke lambda expression
@FunctionalInterface
interface B extends A{
	
}


interface K{
	public void m4();
}
class Demo implements K{
	public void m4() {
		System.out.println("Hello...");
	}
}

class Te{
	public static void main(String[] args) {
		K d= ()->System.out.println("Hello....");
		d.m4();
	}
}