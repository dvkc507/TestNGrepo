package prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;


public class Pack5 {
	@Test(description ="check element is part of collection or not")
	public void checkEleCollection() {
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.contains(1));
		Set set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println(set.contains("One"));
		Map map = new HashMap();
		map.put(list, set);
		System.out.println(map);
		System.out.println(map.containsKey(list));
		System.out.println(map.containsKey(set));
		//to check one collection is there in another collection
		List list2 = new ArrayList(list);
		System.out.println(list2);
		System.out.println(list.containsAll(list2));
		Collections.reverse(list2);
		System.out.println("After reverse :"+list2);
		//Converting Arraylist to linkedList
		LinkedList<Integer> llist = new LinkedList(list2);
		System.out.println(llist);
		Collections.sort(llist);
		System.out.println(llist);
		System.out.println("min value :"+llist.get(0)+" max value :"+llist.get(llist.size()-1));
		Collections.unmodifiableList(llist);
	}
	
	@Test(description = "Highest and lowest values in list")
	public void reverseList() {
		List<Integer> list = new ArrayList();
		list.add(1);
		
	}

}
