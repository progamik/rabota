package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextLine()));
    }

    public static String calc(String input) {
        String[] parts = input.trim().split("");
        if (parts.length != 3) throw new RuntimeException("Неверный формат");

        int a = parseInt(parts[0]);
        int b = parseInt(parts[2]);
        if (a < 1 || a > 10 || b < 1 || b > 10) throw new RuntimeException("Числа должны быть от 1 до 10");

        String op = parts[1];
        int result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new RuntimeException("Недопустимая операция");
        };
        return String.valueOf(result);
    }

    static int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            throw new RuntimeException("Вводите только целые числа");
        }
    }
}

