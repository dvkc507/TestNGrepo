package prob;

import java.util.ArrayList;
import java.util.List;

public class StaticblockTest {
	//static blocks are used to initialize static variables
	//static block will be executed first
	/*	
	 * Final Constructor: 	In Java, you cannot declare constructors as final.
	 * Constructors are not inherited, so there's no sense in declaring them final.
	 * Static Constructor: 	Constructors cannot be static in Java. Constructors are
	 * called to initialize an instance of a class, 
	 * Private Constructor: Making a constructor private means that it can only be accessed within the class
	 * itself. This is commonly used in Singleton design pattern where you want to
	 * ensure that only one instance of a class is created
	 */
	public static List list = new ArrayList();
	static {
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println("From static block"+list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("In side main "+ list.get(0));
	}

}
