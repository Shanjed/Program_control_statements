package com.company;

import java.util.Scanner;
public class EvenNumbers { public static void main(String[] args) {

    int number , i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit: ");
    number = sc.nextInt();
    i=2;

    System.out.println("List of even numbers: ");
    //the while loop executes until the condition becomes false
       /* while (i <= number){
            System.out.println( i + " " );
            i=i+2; //increments the variable i by 2
        }
        */
    for ( i= 2;i<=number  ; i=i){
        System.out.println(i + "");
        i=i+2;


    };



}
}
