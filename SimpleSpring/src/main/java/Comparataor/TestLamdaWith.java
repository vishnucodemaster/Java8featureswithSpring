package Comparataor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class TestLamdaWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(20);
		l.add(19);
		l.add(25);
		l.add(5);
		System.out.println(l);
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		//System.out.println(l);
		l.stream().forEach(System.out::println);
	}

}
