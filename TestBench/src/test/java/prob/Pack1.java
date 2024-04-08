package prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import sun.net.www.protocol.http.HttpURLConnection;
//https://rahulshettyacademy.com/blog/index.php/java-interview-questions/
public class Pack1 {
	@Test(description="Random Number generation")
	public void random() {
		Random r = new Random();
		int num = r.nextInt(100);// it generates any random number between 0 to 100
		System.out.println(num);		
	}
	@Test(description="Generate a random digit (0-9) and append it to the StringBuilder")
	public void randomPhoneNum() {
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=10;i++) {
			sb.append(r.nextInt(10));
		}
		//Convert string builder to string use toString(); else output will be of string buffer type
		//String str = sb.toString();System.out.println(sb.getClass().getName()); //java.lang.StringBuilder
		System.out.println(sb.toString());
	}
	@Test(description= "String reverse")
	public void rev() {
		String str = "Hello";
		char[] ch = str.toCharArray();
		String rev = "";
		for(int i= str.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
		
	}
	@Test(description= "String reverse using stringBuffer")
	public void bufferRev() {
		String str = "Hello";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	@Test(description= "Number reverse")
	public void numRev() {
		int num = 123;
		/*
		 * if we give 0123 it will not work, In Java, integers don't retain leading
		 * zeroes, if you try to print normal number starting with zero you will get
		 * different number, so went reverse a number starting with zero
		 */
		int rev = 0;
		// or while(num!=0)
		for(int i=0;num!=0;i++) {
			int div = num % 10;
			rev = rev * 10 + div;
			num = num / 10;
		}
		System.out.println(rev);

	}
	@Test(description= "Swap two strings")
	public void swapString() {
		String str1 = "boy";
		String str2 = "baby";
		// Extract substring starting from index 0 (inclusive) to index 5 (exclusive)
		//String substr2 = str.substring(0, 5);
		// Extract substring starting from index 7 (inclusive) to the end of the string
		//String substr1 = str.substring(7);
		str1 = str1+str2;
		str2 = str1.substring(0,str1.length()-str2.length());//(0,3) means 0 position to 2 position
		System.out.println("Str2 :"+str2);
		str1 = str1.substring(str2.length());//(3)means third position to last(Position starts from 0)
		System.out.println("str1 :"+str1);
	}
	@Test(description= "fibonacci series")
	public void fibonamcci() {
		int a=0;
		int b=1;
		int sum =0;
		while(sum<=10) {
			//0112358
			System.out.print(sum + " ");	
			sum = a+b;//1 1+1 1+2 2+3 3+5 5+8
			a=b;//1 1 2 3 5
			b=sum;//1 2 3 5 8		
		}
	}
	@Test(description ="Sum of digits of given number")
	public void sumOfDigit() {
		
		String strValue = "123";
		int intValue = Integer.parseInt(strValue);
		int intValue2 = Integer.valueOf(strValue);

		int m = 12;
		String str1 = String.valueOf(m);
		str1 = m + "";

		char c = 's';
		String str2 = String.valueOf(c);
		str2 = c + "";

//now lets start sum of digits
		int val = 1236;
		String string = String.valueOf(val);
		char[] chArr = string.toCharArray();
		int sum = 0;
		List<String> list = new ArrayList();
		for(char ele: chArr) {
			list.add(String.valueOf(ele));
		}
		for (String l : list) {
			sum = Integer.parseInt(l) + sum;
		}
		System.out.println(sum);
	}
	@Test(description ="Sum of digits of given num")
	public void sumodDigits() {
		int num = 123;
		int sum =0;
		int rev=0;
		while(num!=0) {
			int div = num%10;
			rev=rev+div;
			num= num/10;	
		}
		System.out.println(rev);
		
	}
	@Test(description ="prime or not")
	public void primeTest() {
		int num =10;
		if(num<=1) {
			
		}
		else if(num%2==0)
		{
			System.out.println("Is prime");
		}
		
	}
}
