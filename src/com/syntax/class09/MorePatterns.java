package com.syntax.class09;

public class MorePatterns {
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		for (int x=1; x<=9; x++) {
			for(int y=1; y<=9; y++) {
				System.out.print(y);
			}System.out.println();
		}
		
		for (int b=5; b>=1; b--) {
			for (int f=5; f>=1; f--) {
				System.out.print(f);
				
			}System.out.println();
			
		}
		for (int n=5; n>=1; n--) {
		for (int m=5; m>=1; m--) {
			System.out.print(n);
		}System.out.println();
		}
	}
}