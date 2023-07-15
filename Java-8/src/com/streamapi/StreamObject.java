/**
 * 
 */
package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AR
 *
 */
public class StreamObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s = { "sultan", "mastan", "pathan", "sohail" };
		Stream<String> stream = Stream.of(s);
		List<String> list = stream.filter(e -> e.endsWith("n")).collect(Collectors.toList());
		System.out.println(list);
		List<Integer> list2 = List.of(2, 3, 4, 5, 6, 7, 8);
		List<Integer> list3 = list2.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(list3);
		List<String> of = List.of("Abdullah","Mastan","Abul Hasan");
		List<Integer> collect = of.stream().map(a-> a.compareToIgnoreCase("Abdullah")).collect(Collectors.toList());
		System.out.println(collect);
	}

}
