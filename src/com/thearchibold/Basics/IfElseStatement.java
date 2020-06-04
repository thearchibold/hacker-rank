package com.thearchibold.Basics;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
	    Scanner numInput = new Scanner(System.in);
	    int n = numInput.nextInt();

	    if(n >= 1 && n<=100){
            if(n % 2 == 1 || ((n <=20 && n >= 6) && n % 2== 0)){
                System.out.println("Weird");
            }else if((n % 2 == 0 && n > 20) || (n >= 2 && n <= 5)){
                System.out.println("Not weird");
            }
        }



//
    }
}
