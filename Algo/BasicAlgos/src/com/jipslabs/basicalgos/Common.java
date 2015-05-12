package com.jipslabs.basicalgos;

public class Common {
	
	public static int findGCD(int a, int b){
		if(b ==0){
			return a;			
		}
		int r = a%b;		
		System.out.println("r:"+r);
		return findGCD(b, r);
		
	}
	
	public static boolean isPrime(int n){
		if(n<2)return false;
		for(int i=2; i*i<=n; i++){
			if(n%i == 0) return false;
		}
		return true;
		
	}
	
	public static void printFileNameAndExt(String filename){
		if(filename == null || filename.length() == 0){
			return;			
		}
		if(!filename.contains(".")){
			System.out.println("The file name is"+filename);			
		}
		int dot = filename.indexOf(".");
		System.out.println("The dor is at"+dot);
		System.out.println("The filename is "+filename.substring(0, dot));
		System.out.println("The file extension is "+filename.substring(dot+1));
		
	}
	
	public static boolean isPallindrom(String str){
		if(str == null){
			return false;			
		}
		if(str.length() == 0 || str.length() == 1){
			return true;			
		}
		for(int i=0; i<=str.length()/2; i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}			
		}
		return true;
		
	}

}
