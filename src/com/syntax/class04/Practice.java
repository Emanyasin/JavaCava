package com.syntax.class04;

import java.util.Scanner;

public class Practice {

	  public static void main(String[] args){
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter first number");
		    int num=scan.nextInt();
		    
		    System.out.println("Please enter second number");
		    
		    int num1=scan.nextInt();
		    
		    if (num*num1>=1){
		      System.out.println("true");
		      
		    }else {
		      
		      System.out.println("false");
		    }
		    
		    
		  }
}
