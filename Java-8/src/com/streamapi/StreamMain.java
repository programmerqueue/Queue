/**
 * 
 */
package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AR
 *
 */
public class StreamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//     create a list and filter all even number from list
//		without using streamapi
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> list2 = new ArrayList<>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				list2.add(i);
			}
		}
		System.out.println(list);
		System.out.println(list2);

//  create a list and filter all even number from list
//			with using streamapi
//		Stream<Integer> stream = list.stream();
//		List<Integer> list3 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(list3);
		List<Integer> list3 = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println(list3);
		List<Integer> list4 = list.stream().filter(a -> a < 6).collect(Collectors.toList());
		System.out.println(list4);
		
	}

}
