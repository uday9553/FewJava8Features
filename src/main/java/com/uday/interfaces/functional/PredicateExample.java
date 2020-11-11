package com.uday.interfaces.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateExample implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		
		if(t!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Predicate<Integer> predInt=(t)->{
			if(t!=0) {
				return true;
			}else {
				return false;
			}
		};

		System.out.println("using lambda for value 10 is "+predInt.test(10));
		
		Predicate<Integer> predInt1=(t)->t!=0;		
		System.out.println("using lambda for value 0 is "+predInt.test(0));
		
		List<Integer> intList=Arrays.asList(10,20,0,30);
		//filter uses predicate interface
		intList=intList.stream().filter(predInt1).collect(Collectors.toList());
		intList=Arrays.asList(10,20,0,30);
		intList=intList.stream().filter(t-> t!=0).collect(Collectors.toList());
		
		
	}

}
