package application;

import java.util.ArrayList;
import java.util.List;

public class Contravariance {
	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10); // --> OK
		myNums.add(3.14); // --> OK
		
		//Number x = myNums.get(0); erro de compilacao --> ERROR
		
		/*
		 * PUT - OK
		 * GET - ERROR
		 */
	}
}
