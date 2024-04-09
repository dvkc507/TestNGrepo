package prob;

public class StaticClassTest {
	
	/*
	 * When you create a class inside another class it is called a nested class,
	 * static class only be created as a nested class. Members of the static class
	 * can be directly accessed using the outer class. A static class cannot access
	 * non-static members of the Outer class Static class members can be called with
	 * outer class reference Static classes are always nested or inner class You can
	 * use access modifier for static class
	 */
	
	static class InnerClass{
		static int i =10;
	}
public static void main(String[] srags) {
	StaticClassTest.InnerClass child = new StaticClassTest.InnerClass();
	System.out.println(InnerClass.i);
	System.out.println(child.i);
}
}
