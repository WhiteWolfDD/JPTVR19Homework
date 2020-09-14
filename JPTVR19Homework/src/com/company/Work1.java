package com.company;

import java.util.Scanner;

public class Work1 {

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int userInput = scanner.nextInt();
        int animal = userInput % 12;
        int color = userInput % 10;
        switch (color){
            case 0:
                result = "белой";
                break;
            case 1:
                result = "белого";
                break;
            case 2:
                result = "чёрной";
                break;
            case 3:
                result = "чёрного";
                break;
            case 4:
                result = "синей";
                break;
            case 5:
                result = "синего";
                break;
            case 6:
                result = "красной";
                break;
            case 7:
                result = "красного";
                break;
            case 8:
                result = "желтой";
                break;
            case 9:
                result = "желтого";
                break;
        }
        switch (animal){
            case 0:
                result += " обезьяны";
                break;
            case 1:
                result += " петуха";
                break;
            case 2:
                result += " собаки";
                break;
            case 3:
                result += " свиньи";
                break;
            case 4:
                result += " крысы";
                break;
            case 5:
                result += " быка";
                break;
            case 6:
                result += " тигра";
                break;
            case 7:
                result += " заяца";
                break;
            case 8:
                result += " дракона";
                break;
            case 9:
                result += " змеи";
                break;
            case 10:
                result += " лошади";
                break;
            case 11:
                result += " овцы";
                break;
        }
        System.out.println("Год " + result);

    }
}
