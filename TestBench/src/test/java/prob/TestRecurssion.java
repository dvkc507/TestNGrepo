package prob;

public class TestRecurssion {

	public static void main(String[] args) {
		// Printing numbers from 1 to 10 with out using loop
		printNum(1);
	}

	private static void printNum(int i) {
		// TODO Auto-generated method stub
		if (i <= 10) {
			System.out.println(i);
			i++;
			printNum(i);
		}
	}

}
