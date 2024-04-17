package javaLatest;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.testng.annotations.Test;

public class Java8 {

	@Test(description = "Testing predicate")
	public void testPredicate() {
		int[] intArr = { 1, 2, 3, 4 };
		Predicate<Integer> p = x -> x % 2 == 0;
		for (Integer ele : intArr) {
			if (p.test(ele)) {
				System.out.println("Even number : " + ele);
			}
		}
	}
	@Test(description = "Testing predicate with return")
	public void testPredicate2() {
		int[] intArr = { 1, 2, 3, 4 };
		Predicate<Integer> p = x -> x % 2 == 0;
		for (Integer ele : intArr) {
			boolean b =p.test(ele);
					if(b){
				System.out.println("Even number : " + ele);
			}
		}
	}

	@Test(description = "Testing Function")
	public void testFunction() {
		int[] intArr = { 1, 2, 3, 4 };
		Function<Integer, Integer> f = x -> x * x;
		for (Integer ele : intArr) {
			Integer val = f.apply(ele);
			System.out.println(val);
		}
	}
	@Test(description = "Testing unaray operator")
	public void testUnaryOperator() {
		int[] intArr = { 1, 2, 3, 4 };
		IntUnaryOperator f = x -> x * x;
		for (Integer ele : intArr) {
			Integer val = f.applyAsInt(ele);
			System.out.println(val);
		}
	}
	@Test(description = "Testing length with Function")
	public void testLengthUsingFunction() {
		
		Function<String, Integer> f = x -> x.length();
		System.out.println(f.apply("Testing"));
	}
	@Test(description = "Testing square Root with Function")
	public void testSquareRootUsingFunction() {
		
		Function<Double, Double> f = x -> Math.sqrt(x);
		System.out.println(f.apply((double) 25));
	}
	@Test(description = "supplier Testing")
	public void testSupplier() {
		Supplier<Date> supplier = ()->new Date();
		System.out.println("Current date :"+supplier.get());
	}
	@Test(description= "BiFunction")
	public void biFunctionTest() {
		BiFunction<String,String,String> biFunction = (x,y)->x+y;
		System.out.println(biFunction.apply("Krishna", "Chaitanya"));
	}
	
	
	
	
	
	
	
	
	
	
	
}
