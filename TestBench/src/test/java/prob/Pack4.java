package prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pack4 {

	@Test(description = "Non repeated char")
	public void nonRepeatChar() {
		String str = "chaitanya";
		char[] chArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap();
		for (Character ele : chArr) {
			if (map.containsKey(ele)) {
				map.put(ele, map.get(ele) + 1);
			} else {
				map.put(ele, 1);
			}
		}
		for (Character ele : map.keySet()) {
			if (map.get(ele) <= 1) {
				System.out.println(ele + " Non repeated");
			}
		}
	}

	@Test(description = "maximum consecutive ones in a given array")
	public void maxConseOnes() {
		Integer[] intArr = { 0, 1, 0, 2, 0, 2, 1, 2, 1 };
		int count = 0;
		for (Integer ele : intArr) {
			if (ele == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test(description = "Testing Hard Assetions")
	public void assertTest() {
		int count = 4;
		int[] intArr = { 1, 2, 3, 4 };
		// default assertions are Hard assetions, if you want to continue statement then
		// use soft assertions
		// assertEquals() can compare Strings, Integers, Doubles, int, char, object,
		// collection and many more variables
		Assert.assertNotEquals(count, 4);
		Assert.assertTrue(true, "condition should be true ");// if it fails message will be printed
		Assert.assertFalse(false, "condition should be false");// if condition is true then assert will fail and message
																// will be printed.
		Assert.assertEquals(count, 3);
		String s1 = new String();
		String s2 = new String();
		Assert.assertNotSame(s1, s2, "compares two objects and they shoub be different");
		Assert.assertSame(intArr, intArr, "Comparing two references/objects");
		// List l = new ArrayList();
		// Assert.assertNull(l,"contains null");//java.lang.AssertionError: contains
		// null expected [null] but found [[]]
		if (1 > 2) {
			Assert.fail("Expected to fail");
		}

	}

	@Test(description = "Soft assert test")
	public void softAssertTest() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(false, false);
		softAssert.assertNotEquals(false, false);
		softAssert.assertFalse(false, null);
		softAssert.assertTrue(false);
		softAssert.assertNull(softAssert, null);
		softAssert.assertNotNull(softAssert, null);
		softAssert.assertNotSame(softAssert, softAssert, null);
		softAssert.fail(null);
		softAssert.assertAll();
		// notify() will wakes up only one thread
		// notifyAll() will wakes up all threads
		/*
		 * assertAll() is method from SoftAssert. When using soft assertions, each
		 * assertion failure does not immediately stop the test execution. Instead, the
		 * test continues to execute, allowing you to gather multiple assertion
		 * failures. assertAll() is used to mark the test as failed at the end if we
		 * have any failures. It will add all assertions at the end and make the test
		 * pass/fail at end.
		 */
	}

	@Test(description = "First and Last index for given number in an array")
	public void firstLastIndex() {
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		for (Integer ele : list) {
			if (ele == 1) {
				System.out.println("First Index of 1 is :" + list.indexOf(ele));
				System.out.println("Last Index of 1 is :" + list.lastIndexOf(ele));
				break;
			}
		}
	}

	@Test(description = "Java program to shift only zero's to right")
	public void shiftZero() {
		Integer[] intArr = { 1, 2, 0, 4, 0, 3, 0, 1, 0 };
		int length = intArr.length - 1;
		//List<Integer> list = Arrays.asList(intArr);
		List<Integer> list = new ArrayList(Arrays.asList(intArr));
		 Iterator<Integer> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Integer ele = iterator.next();
	            if (ele == 0) {
	                iterator.remove();
	            }
	        }
		System.out.println("After removing :"+list);
		int afterLength = list.size() - 1;
		for (int i = afterLength; i <= length; i++) {
			list.add(0);
		}
		System.out.println("Shifted zeros to right :"+list);

	}
	@Test(description ="removing duplicates from list")
	public void removeDuplicate() {
		Integer[] intArr = {1,2,3,1,2,3};
		List<Integer> list = Arrays.asList(intArr);
		Set<Integer> set = new LinkedHashSet();
		set.addAll(list);
		System.out.println(set);//[1,2,3]
		Integer[] intArr1 = {1,2,3,1,2,4};
		list.retainAll(Arrays.asList(intArr1));//[1,2,3,1,2,3] removes uncommon elements
		System.out.println(list);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
