package com.tom.d204CountPrimer;

public class SelfSolution2 {
	public static int countPrimes(int n) {
		int count=0;
		for(int i=1;i<n;i++){
			if(isPrime(i)){
				count++;
				System.out.print(i);
			}
		}
		return count;
	}
	private static boolean isPrime(int n){
		if(n<2){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
