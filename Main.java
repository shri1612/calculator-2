package com.shrijaa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b ,choice;
        float result = 0;
        Scanner buf = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = buf.nextInt();
        System.out.print("Enter the second number: ");
        b = buf.nextInt();
        System.out.print("\n1:addition.\n2:subtraction.");
        System.out.print("\n3:multiplication.\n4: divide.");
        System.out.print("\n5: r1emainder.\n6: exit.");
        System.out.print("\nEnter our choice:");
        choice = buf.nextInt();
        switch (choice) {
            case 1 -> result = (a+b);
            case 2 -> result = (a-b);
            case 3 -> {
                result = (a*b);
            }
            case 4 -> {
                result = ((float) a / (float) b);
                break;
            }
            case 5 -> {
                result = (a%b);
                break;
            }
            default -> System.out.println("An Invalid Choice!!!\n");
        }
        if (choice >= 1 && choice <= 5)
            System.out.println("result is: " + result);
    }
}



