package prob;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

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
		Integer[] intArr = {0,1,0,2,0,2,1,2,1};
		int count=0;
		for(Integer ele: intArr) {
			if(ele==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
