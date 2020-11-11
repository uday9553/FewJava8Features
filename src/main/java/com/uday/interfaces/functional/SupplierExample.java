package com.uday.interfaces.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample implements Supplier<String> {

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		Supplier<String> stringsupplier=()->"Hello from supplier";
		System.out.println(stringsupplier.get());
		List<String> stringList=Arrays.asList("ccc","bbbb","aaa");
		System.out.println(stringList.stream().findAny().orElseGet(stringsupplier));
		
		List<String> stringList1=Arrays.asList();
		System.out.println(stringList1.stream().findAny().orElseGet(stringsupplier));
	}

}
