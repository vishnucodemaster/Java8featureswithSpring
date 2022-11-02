package LambdaExpression;

import java.util.function.Function;
//Lambda functions are anonymous function nameless,without reurn type,without modifiers
public class Test {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("The Square of 4:"+f.apply(4));
		System.out.println("The Square of 5:"+f.apply(5));
		// TODO Auto-generated method stub
		
		
	//	() -> System.out.println("Hello");
		
	//	( a ,b)->System.out.print(a+b);
		

	}

}
