package prob;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Pack3 {

	@Test(description = "Output aabbbcccc with the input a2b3c4")
	public void a2b3c4TOaabbbcccc() {
		String str = "a2b3c4";
		String onlyInt = str.replaceAll("[a-z,A-Z]", " ").trim();
		String onlyStr = str.replaceAll("[0-9]", " ").trim();
		String[] intArr = onlyInt.split(" ");
		String[] strArr = onlyStr.split(" ");
		int count = 0;
		String val = "";
		for (int i = 0; i < intArr.length; i++) {
			count = Integer.parseInt(intArr[i]);
			val = strArr[i];
			for (int j = 0; j < count; j++) {
				System.out.print(val);
			}
		}
	}

	@Test(description = "Simple date format")
	public void dateFormat() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		System.out.println(sdf.format(date));// 07-28-2024 11:28:46
	}

	@Test(description = "small map program")
	public void mapTest() {
		Map<String, Integer> map = new HashMap();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		System.out.println(map);// {one=1, two=2, three=3}
		for (Entry<String, Integer> ele : map.entrySet()) {
			System.out.println("Key :" + ele.getKey() + " Value:" + ele.getValue());
		}
		for (String ele : map.keySet()) {
			System.out.println("Key :" + ele + " value:" + map.get(ele));
		}
		for (Integer ele : map.values()) {
			System.out.println(ele);
		}
	}

	@Test(description = "printing null value")
	public void nullTesting() {
		String str = null;
		System.out.println(str);// null
		List<Integer> list = Arrays.asList(1, null, 3);
		System.out.println(list.contains(null));// true
		System.out.println(list);// [1, null, 3]
	}

	@Test(description = "First letter of a given string")
	public void firstLetterInString() {
		String str = "Doppalapudi Venkata Krishna Chaitanya";
		String[] strArr = str.split(" ");// need to provide empty space or use str.split(\\s)
		for (String ele : strArr) {
			System.out.println(ele.charAt(0));
		}
	}

	@Test(description = "Replace a charcater in a given string")
	public void replaceChar() {
		String str = "Hell Boy";
		System.out.println(str.replaceAll("H", "B"));// it accepts both string types replaceAll(String, String)
		char ch = 'H'; // replace H with empty space
		System.out.println(str.replaceAll(String.valueOf(ch), " "));// ell Boy
		System.out.println(str.replaceAll(Character.toString(ch), "H"));// Hell Boy
		System.out.println(str.replaceFirst("l", "e"));// Heel Boy
	}

	@Test(description = "Program to check vowel in string")
	public void vowelTest() {
		String str = "chaitanya";
		char[] chArr = str.toCharArray();
		System.out.println(chArr); // chaitanya
		for (char ele : chArr) {
			if (ele == 'a' || ele == 'e' || ele == 'i' || ele == 'o' || ele == 'u') {
				System.out.println("contains vowel :" + ele);
			}
		}
	}

	@Test(description = "reverse a string with spaces")
	public void reverseWithSpaces() {
		String str = "Hello Hell Boy";
		String[] strArr = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (String ele : strArr) {
			String rev = "";
			char[] chArr = ele.toCharArray();
			for (int i = chArr.length - 1; i >= 0; i--) {
				rev = rev + chArr[i];
			}
			sb.append(rev + " ");
		}
		System.out.println(sb.toString().trim());// olleH lleH yoB
		System.out.println(sb.reverse().toString().trim());// Boy Hell Hello
		StringBuffer sb2 = new StringBuffer(str);// given-> Hello Hell Boy
		System.out.println(sb2.reverse()); // yoB lleH olleH
		// if you want to preserve spaces in same order
		List<Integer> list = new ArrayList();
		char[] chArray2 = str.toCharArray();
		for (int i = 0; i < chArray2.length - 1; i++) {
			if (chArray2[i] == ' ') {// here we have to use single brace
				list.add(i);
			}
		}
		String rep = str.replaceAll(" ", "");
		StringBuffer sb3 = new StringBuffer(rep);
		sb3.reverse();
		System.out.println(sb3);
		for (Integer ele : list) {
			sb3.insert(ele, " ");
		}
		System.out.println(sb3);// yoBll eHol leH given->Hello Hell Boy
	}

	@Test(description = "product of arry")
	public void addArray() {
		int[] arr = { 1, 2, 3, 4 };
		int sum = 0;
		for (int ele : arr) {
			sum = sum + ele;
		}
		System.out.println(sum);
	}

	@Test(description = "second largest and smallest array")
	public void secondMaxMin() {
		int[] arr = { 1, 2, 4, 5, 8, 7 };
		Arrays.sort(arr); //
		int len = arr.length;
		System.out.println(arr[1]);
		System.out.println(arr[len - 2]);
		// or
		Integer[] arrInt = { 1, 2, 4, 5, 8, 7 };
		Arrays.sort(arrInt);
		int length = arrInt.length;
		System.out.println("Second smallest :"+arrInt[1]);
		System.out.println("Second largest :"+arrInt[length-2]);
	}
	@Test(description = "reverse of Arry")
	public void revArray() {
		Integer[] arr = {3,4,7,6,1,0};
		System.out.println("Before "+Arrays.asList(arr));//Before [3, 4, 7, 6, 1, 0]
		Collections.reverse(Arrays.asList(arr));
		System.out.println("After "+Arrays.asList(arr));//After [0, 1, 6, 7, 4, 3]
	}
	@Test(description = "reverse of Array")
	public void sortArr() {
		Integer[] arr = {3,4,7,6,1,0};
		System.out.println("Before sorting "+Arrays.asList(arr));//Before sorting [3, 4, 7, 6, 1, 0]
		Arrays.sort(arr);
		System.out.println("Before reverse "+Arrays.asList(arr));//Before reverse [0, 1, 3, 4, 6, 7]
		Collections.reverse(Arrays.asList(arr));
		System.out.println("After reversing "+Arrays.asList(arr));//After reversing [7, 6, 4, 3, 1, 0]
	}
	@Test(description = "List Type convertion can be possible for wrapper classes and String")
	public void typeConvertion() {
		Integer[] arrInt = {1,2,3,4};
		List<Integer> listInt = Arrays.asList(arrInt);
		System.out.println(listInt);//[1, 2, 3, 4]
		String[] strArr = {"one","two","three"};
		List strList = Arrays.asList(strArr);
		System.out.println(strList);//[one, two, three]
		
		Collections.reverse(listInt);
		System.out.println(listInt);//[4, 3, 2, 1]
		Collections.reverse(strList);
		System.out.println(strList);//[three, two, one]
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
