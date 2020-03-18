//package com.syntax.class07;
//
//public class Loop {
//
//	public static void main(String[] args) {
//
//		// how to print 50 to 1
//		// how to print odd numbers from 1 to 20
//
//		int num = 50;
//
//		while (num >= 1) {
//			System.out.println(num);
//			num--;
//
//		}
//		// 1st way
//		int num1 = 1;
//
//		while (num1 <= 20) {
//			System.out.println(num1);
//			num1 += 2;
//		}
//		// 2nd way
//		int num2 = 1;
//		while (num2 <= 20) {
//			if (num2 % 2 != 0) {
//				System.out.println(num2);
//			}
//			num2++;
//
//			// 3rd way
//			int y = 1;
//			while (y <= 20) {
//				System.out.println(y++);
//				y++;
//
//				// 2 way using mod and if condition
//				int n = 1;
//				while (n <= 20) {
//					if (n % 2 != 0) {
//						System.out.println(n);
//					}
//					n++;
//				}
//
//			}
//		}
//	}
//}