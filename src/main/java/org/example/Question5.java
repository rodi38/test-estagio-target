package org.example;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;
        System.out.print("Digite uma string para inverter seus caracteres: ");
        msg = sc.nextLine();
        System.out.println(reverseStr(msg));

    }
    public static String reverseStr(String str) {
        if (str.length() < 2) {
            return "A sua string deve ter ao menos 2 caracteres.";
        }
        StringBuilder reversedStr = new StringBuilder();

        for (int i = str.length(); i > 0; i--) {
            reversedStr.append(str.charAt(i-1));
        }

        return reversedStr.toString();
    }
}
