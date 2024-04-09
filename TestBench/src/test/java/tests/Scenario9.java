package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Scenario9 {

	@Test(description = "Collections testing")
	public void collectionsTesting() {		
		Integer[] intArr = {3,4,5,1,2,};
		List list = new ArrayList(Arrays.asList(intArr));
		Collections.reverse(list);//[2, 1, 5, 4, 3]
		System.out.println("After reversing: "+list);
		
		Collections.sort(list);//[1, 2, 3, 4, 5]
		System.out.println("After sorting: "+list);
		
		Collections.shuffle(list);//[3, 5, 2, 4, 1]
		System.out.println("After shuffling: "+list);
		
		Collections.sort(list,Collections.reverseOrder());//[5, 4, 3, 2, 1]
		System.out.println("sort reverse order: "+list);
		
		Collections.fill(list, 0);//[0, 0, 0, 0, 0]
		System.out.println("After filling with zero: "+list);
		
		Collections.unmodifiableList(list);//cannaot modified
		Collections.unmodifiableSet(null);
		Collections.unmodifiableMap(null);
		Collections.unmodifiableSortedMap(null);
		Collections.unmodifiableSortedSet(null);
		Collections.unmodifiableCollection(null);
	}
}
