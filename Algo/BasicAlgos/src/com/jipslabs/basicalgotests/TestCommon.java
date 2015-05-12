package com.jipslabs.basicalgotests;

import java.util.Iterator;

import com.jipslabs.basicalgos.ArrayStack;
import com.jipslabs.basicalgos.Common;

public class TestCommon {
	public static void main(String [] args){
		
		ArrayStack<Integer> ints = new ArrayStack<Integer>();
		ints.push(10);
		ints.push(11);
		ints.push(12);
		ints.push(13);
		ints.push(14);
		System.out.println(ints.pop());
		System.out.println(ints.pop());
		
		Iterator<Integer> i = ints.iterator();
		while(i.hasNext()){
			System.out.println("in iterator");
			System.out.println(i.next());
			
		}
		
		
		
		
		/*int sum = 0;
		String query = args[0];
		for(int i=1; i<args.length; i++){
			if(args[i].contains(query)){
				System.out.println(args[i]);
				
			}			
		}*/
		
		
		//System.out.println("SOSe is Palindrom"+Common.isPallindrom("SS"));
		//Common.printFileNameAndExt("hello.txt");
		/*if(args.length >0){
			for(int i=0; i<args.length; i++){
				sum+=Integer.parseInt(args[i]);				
			}
			System.out.println("the sum is"+sum);			
		}
		
		/*int gcd = GCD.findGCD(18, 34);
		System.out.println("GCD:"+gcd);
		
		System.out.println("is 17 prime?"+GCD.isPrime(187));*/
		
	}

}
