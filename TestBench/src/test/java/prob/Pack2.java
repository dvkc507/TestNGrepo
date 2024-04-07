package prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class Pack2 {

	@Test(description = "Conunt the number of repeated characters in the given string, find duplicates")
	public void countChar() {
		String str = "I am chaitanya";
		System.out.println(str.length());
		Map<Character, Integer> hmap = new LinkedHashMap();
		char[] charArr = str.toCharArray();
		for (char ch : charArr) {
			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			} else {
				hmap.put(ch, 1);
			}
		}
		System.out.println(hmap);
		// { =2, a=4, c=1, t=1, h=1, I=1, i=1, y=1, m=1, n=1}
		for (Character ch : hmap.keySet()) {
			if (hmap.get(ch) > 1) {
				System.out.println("duplicate charcters are :" + ch + " count->" + hmap.get(ch));
			}
		}

	}

	@Test(description = "Duplicates of words in a given string")
	public void test() {
		String str = "Hi Hello Hi chaitanya";
		String[] strArr = str.split(" ");
		System.out.println("number of words in given sring :" + strArr.length);
		Map<String, Integer> map = new LinkedHashMap();
		for (String ele : strArr) {
			if (ele != null && !ele.isEmpty()) {
				if (map.containsKey(ele)) {
					map.put(ele, map.get(ele) + 1);
				} else {
					map.put(ele, 1);
				}
			}
		}
		// duplicate words are
		for (String ele : map.keySet()) {
			if (ele != null && !ele.isEmpty()) {
				if (map.get(ele) > 1) {
					System.out.println("duplicate words are :" + ele + " And there count:" + map.get(ele));
				}
			}
		}

	}

	@Test(description = "Difference between isEmpty and isBlank")
	public void textEmptyVSBlank() {
		// isBlank Returns true if the string is empty or contains only white space
		// codepoints,otherwise false.
		// it will not check null This feature was introduced in java11
		String str = " Testing1";
		String str2 = " ";
		String str3 = "null";
		String str4 = "";
		System.out.println(str.isBlank());// false
		System.out.println(str2.isBlank());// true
		System.out.println(str3.isBlank());// false
		System.out.println(str4.isBlank());// true
		// isEmpty Returns true if, and only if, length() is 0., introduced in java 1.6
		System.out.println(str.isEmpty());// false
		System.out.println(str2.isEmpty());// false
		System.out.println(str3.isEmpty());// false
		System.out.println(str4.isEmpty());// true
	}

	@Test(description = "program to reverse a charArray")
	public void reverseCharArray() {
		char[] chArray = { 'd', 'v', 'k', 'c' };
		System.out.println(chArray);// for this we will get dvkc
		System.out.println(chArray.length);
		String rev = "";
		for (int i = chArray.length - 1; i >= 0; i--) {
			rev = rev + chArray[i];
		}
		System.out.println(rev.toCharArray().getClass().getTypeName());// char[]
		System.out.println(rev.toCharArray());
	}

	@Test(description = "program to reverse a given number array")
	public void reverseNumArray() {
		int[] intArr = { 1, 2, 3, 4 };
		System.out.println(intArr);// for this we will get reference type [I@5d25e6bb
		// to convert intArray to string use Arrays.toString() method, then it will
		// convert to string representation of array
		// like [1,2,3,4]
		// java.util.Arrays, This class contains various methods for manipulating arrays
		// (such assorting and searching).
		// This class also contains a static factory that allows arrays to be viewed as
		// lists.

		String str = Arrays.toString(intArr);
		StringBuffer sb = new StringBuffer(str); // like [1,2,3,4]
		System.out.println(sb.reverse().toString());// like ]4,3,2,1,[
	}

	@Test(description = "program to reverse a given number array")
	public void reverseNumArr() {
		int[] intArr = { 1, 2, 3, 4 };
		List<Integer> list = new ArrayList();
		for (int i = intArr.length - 1; i >= 0; i--) {
			list.add(intArr[i]);
		}
		System.out.println(list);// like [4,3,2,1,]
	}

	@Test(description = "Finding capital words in a string")
	public void isUpperCase_Test() {
		String str = "AppleBoy";
		char[] chArr = str.toCharArray();
		int count = 0;
		for (char ele : chArr) {
			if (Character.isUpperCase(ele)) {
				System.out.println(ele + " is in upper case");
				count++;
			}
		}
		System.out.println("Total number of capital words :" + count);
	}

	@Test(description = "Finding capital words in a string")
	public void toUpperCase_Test() {
		String str = "AppleBoy";
		System.out.println(str.toUpperCase());
	}

	@Test(description = "printing number 0123")
	public void print_0123() {
		int i = 0123;// we cant give prefix 0 for numbers
		System.out.println(String.valueOf(i));// still getting 83
	}
	@Test(description = "LongestConsecutiveOccurenceExample")
	public void longestConsecutiveOccurenceExample() {
		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
		System.out.println(arr.length);
		int min = arr[0];
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[1]<min) {
				min=arr[1];
			}
			else{
				max=arr[1];
			}		
		}
		System.out.println("Min value :"+min+" Max values are "+max);
	}

}
