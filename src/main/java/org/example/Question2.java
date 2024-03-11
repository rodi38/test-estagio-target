package org.example;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Digite um número para verificar se ele faz ou não parte da sequência fibonacci: ");
        number = Integer.parseInt(sc.nextLine());

        sc.close();

        isFib(number);
    }
    public static void isFib(int x) {
        int a = 0;
        int b = 1;
        if (x > 1) {
            System.out.print(a + " " + b);
        }
        while (b < x) {
            int tempNumber = b;
            b = a+b;
            a = tempNumber;
            System.out.print(" " + b);
        }

        if (x == b) {
            System.out.println("\nO número informado pertence a sequência fibonnaci.");
            return;
        }
        System.out.println("\nO número informado NÃO pertence a sequência fibonnaci.");

    }
}

