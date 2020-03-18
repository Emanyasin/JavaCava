package com.syntax.class11;

import java.util.Scanner;

public class Homework {
	  public static void main(String[] args){
		    Scanner input;
		    input=new Scanner(System.in);
		    int[] num=new int[5];
		    for(int i=0; i<=num.length-1; i++){
		    num[i]=input.nextInt();
		    }
		    for (int i= num.length; i>0; i--){
		      System.out.println(i);
		    }
		  }
		}