package com.syntax.class09;

public class MilitaryClock {

	public static void main(String[] args) {
		
		for (int x=0; x<=23; x++) {
			for(int y=0; y<=59; y++) {
				if (y<=9) {
					System.out.println(x+ ":"+ "0" +y);
				}else {
					System.out.println ( x+ ":" + y);

				}
			}
		}

	}

}
