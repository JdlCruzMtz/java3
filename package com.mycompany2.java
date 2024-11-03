package com.mycompany.unidad2;

import java.util.Scanner;


public class ejercicio2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer valor:");
        int A = scanner.nextInt();
        System.out.println("Introduce el segundo valor:");
        int B = scanner.nextInt();
        System.out.println("Introduce el tercer valor:");
        int C = scanner.nextInt();

        if (A > B && A>C){
            System.out.println (A + " Es mayor");
        }
        else if (B > A && B>C){
            System.out.println (B + " Es mayor");
        }
        else {
            System.out.println(C + " Es mayor");
        }
    }
}
