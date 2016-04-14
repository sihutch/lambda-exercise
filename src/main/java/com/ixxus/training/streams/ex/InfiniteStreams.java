package com.ixxus.training.streams.ex;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {
	
	/**
	 * @param from the number to find the next prime from
	 * @param count the number of prime numbers to return
	 * @return count prime numbers starting at fromNum
	 * 
	 * TODO: You MUST Implement this using {@link Stream#iterate} hint implement getNextPrime() first 
	 */
	public static List<Integer> getPrimes (int from, int count ) {
		return null;
	}
	
	/**
	 * Get the next prime
	 * @param from the number to start from
	 * @return The next prime number that is greater than this one
	 * 
	 * TODO: Implement this method any way you like: hint use isPrimeNumber
	 */
	public static int getNextPrime(int from) {
		return -1;
	}
	
	/**
	 * Test if a number is prime
	 * @param i The number to test
	 * @return true if the number is prime otherwise false
	 */
	
	/**
	 * TODO: (Extra credit) re-implement this method using {@link IntStream} hit think ranges and matching
	 * @param i
	 * @return
	 */
	public static boolean isPrimeNumber(int i) {
		if (i < 2) {
			return false;
		}
		for (int d = 2; d <= (int) Math.sqrt(i); d++) {
			if (i % d == 0) {
				return false;
			}
		}
		return true;
	}
}