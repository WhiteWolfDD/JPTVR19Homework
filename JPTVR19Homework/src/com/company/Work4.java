package com.company;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3-ёх значное число: ");
        int userNumber = scanner.nextInt();
        int Number1 = userNumber / 100;
        int Number2 = (userNumber / 10) % 10;
        int Number3 = userNumber % 10;
        int numbersSum = Number1 + Number2 + Number3;
        System.out.println("Число единиц: " + Number3);
        System.out.println("Число десятков: " + Number2);
        System.out.println("Сумма чисел: " + numbersSum);



    }
}
