package OptionalClass;

//NullPointerException. It can crash your code. And it is very hard to avoid it without using too many null checks.
//So, to overcome this, Java 8 has introduced a new class Optional in java.util package

public class Withoutoptionalclass {
	public static void main(String[] args)
	{
		String[] words = new String[10];
		String word = words[5].toLowerCase();
		System.out.print(word);
	}
}
//To avoid abnormal termination, we use the Optional class