package org.example;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row you want to display");
//        Number of row for triangle
        int row=sc.nextInt();
//        loop through each row
        for(int i=1;i<=row;i++){
//            to print spaces
            for(int j=i;j<row;j++) {
                System.out.print(" ");
            }
//              Print stars in each row
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
           }
//            for next line
            System.out.println();
        }

    }
}
