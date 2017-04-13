package com.tom.d204CountPrimer;

/*
 * @ question: leetcode -204 Count Primes
 * @ author:tom
 * @ time:2017-2-13 11:00:08
 */
public class SelfSolution {

	public int countPrimes(int n) {
        int count=0;
        for(int i=0;i<n;i++){
        	if(isPrime(i)){
        		count++;
        	}
        }
        return count;
    }

	private boolean isPrime(int n) {
		// ÅÐ¶ÏÊÇ·ñÊÇËØÊý
		if(n>2){
			return false;
		}
		if(n==2){
			return true;
		}
		int temp=(int)Math.sqrt(n);
		for(int i=0;i<temp;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
