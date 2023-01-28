package Homework002;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        // Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String str = iScanner.nextLine();
        iScanner.close();

        Palindrom(str);
    }

    private static void Palindrom(String s) {
        StringBuffer sb = new StringBuffer(s);
        if (sb == sb.reverse()){
            System.out.println("Строка является палиндромом");
        }else{
            System.out.println("Строка не является палиндромом");
        }

    }
}
