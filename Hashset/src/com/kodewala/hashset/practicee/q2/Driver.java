package com.kodewala.hashset.practicee.q2;

public class Driver {
	public static void main(String[] args) {
		String a = "Aa";
		String b = "Bb";
		String c = "Cc";
		
		int capacity = 16;
		
		int hash = a.hashCode();
		int hashb = b.hashCode();
		int hashc = c.hashCode();
		
		int spreadhash = hash ^ (hash >>> 16);
		int spreadhashb = hashb ^ (hashb >>> 16);
		int spreadhashc = hashc ^ (hashc >>> 16);
		
		int bucket = spreadhash & (capacity -1);
		int bucketb = spreadhashb & (capacity -1);
		int bucketc = spreadhashc & (capacity -1);
		
		System.out.println("Bucket C:- "+bucketc);
		System.out.println("Bucket B:- "+bucketb);
		System.out.println("Bucket A:- "+bucket);
		
		System.err.println(bucketb == bucketc);
		System.out.println(bucket == bucketb);
		System.out.println(bucket == bucketc);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		
		System.out.println();
	}
}
