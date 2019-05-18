package com.praveen.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
	//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());   
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean( BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,2,4}, 3);
		
		System.out.println(result);
	}

}
