package com.uday.interfaces.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample implements Consumer<String> {

	public static void main(String[] args) {
		
		Consumer<String> stringConsumer=(arg)->{
			System.out.println(arg);
		};
		stringConsumer.accept("Uday");
		
		ConsumerExample ce=new ConsumerExample();
		ce.accept("Sagar");
		
		List<String> strList=Arrays.asList("aaa","bbb","ccc");
		strList.forEach(ce);
		strList.forEach(stringConsumer);
		/**
	     * Streams uses Consumer InterFace Internally
	     */
		strList.forEach(response->System.out.println(response));
		

	}

	@Override
	public void accept(String arg0) {
		System.out.println("from accept() "+arg0);
	}

}
