package application;

import java.util.ArrayList;
import java.util.List;

public class Covariance {
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0); // --> OK
		System.out.println(x);
		
		//list.add(20);  erro de compilacao --> ERROR
		
		/*
		 * GET - OK
		 * PUT - ERROR
		 */
	}
}
