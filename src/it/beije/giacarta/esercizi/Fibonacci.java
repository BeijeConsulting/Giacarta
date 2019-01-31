package it.beije.giacarta.esercizi;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public static List<Integer> getFibonacciList(int n) {
		List<Integer> fibonacci = new ArrayList<Integer>();
		if (n > 0) {
			fibonacci.add(1);//f1
			//if (n == 1) return fibonacci;
			if (n > 1) {
				fibonacci.add(1);//f2
				if (n > 2) {
					for (int i = 2; i <= n; i++) {
						fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
					}
				}
			}
		}
		
		return fibonacci;
	}
	
	public static void main(String[] args) {
		
//		NON FARE
//		int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040};
//		for (int c = 0; c < fib.length; c++) {
//			for (int g = 0; g <= c; g++) {
//				System.out.print(fib[g] + " ");
//			}
//			System.out.println();
//		}
		
		for (int f = 1; f <=30; f++) {
			System.out.println(Fibonacci.getFibonacciList(f));
		}
		
//		for (int i = 1; i <= 30; i++) {
//			int f1 = 1;
//			int f2 = 1;
//			for (int j = 1; j <= i; j++) {
//				if (j == 1)	System.out.print(f1 + " ");
//				else if (j == 2) System.out.print(f2 + " ");
//				else {
//					int fn = f1 + f2;
//					System.out.print(fn + " ");
//					f1 = f2;
//					f2 = fn;
//				}
//			}
//			System.out.println();
//		}
		
	}
}
