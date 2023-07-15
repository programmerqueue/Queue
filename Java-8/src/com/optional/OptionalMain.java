/**
 * 
 */
package com.optional;

import java.util.Optional;

/**
 * @author AR
 *
 */
public class OptionalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = null;
		Optional<String> optional = Optional.of(s);
		System.out.println(optional.orElse("asdfghjk"));
//		System.out.println(optional.isPresent());
//		System.out.println(optional.get());

	}

}
