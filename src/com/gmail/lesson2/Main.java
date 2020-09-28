package com.gmail.lesson2;

import java.util.Scanner;

public class Main {
    /*Домашнее задание №1:
       Написать программу которая считывает 5-и значное число с
       клавиатуры и выводит цифры из которого оно состоит.
       Например : Считывается число 54698
       Выводиться:
       5
       4
       6
       9
       8    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 5-ти значное число");
        int n = scan.nextInt();
        int part1 = n / 10000;
        int part2 = n % 10000 / 1000;
        int part3 = n % 1000 / 100;
        int part4 = n % 100 / 10;
        int part5 = n % 10;

        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
        System.out.println(part4);
        System.out.println(part5);

        /*Домашнее задание №2:
        Написать программу которая вычислит и выведет на экран
        площадь треугольника если известны его стороны.  */
        //Вариант1
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;
        double p = (sideA + sideB + sideC) / 2.0;
        double s = p * (p - sideA) * (p - sideB) * (p - sideC);
        System.out.println(Math.sqrt(s));


        //Вариант 2
        double sideA1 = 0.3;
        double sideB1 = 0.4;
        double sideC1 = 0.5;
        double p1 = (sideA1 + sideB1 + sideC1) / 2.0;
        double s1 = Math.sqrt(p1 * (p1 - sideA1) * (p1 - sideB1) * (p1 - sideC1));
        System.out.println("Side A =" + sideA1 + "cм");
        System.out.println("Side B =" + sideB1 + "cм");
        System.out.println("Side C =" + sideC1 + "cм");
        System.out.println("Площадь треугольника: " + (float) s1 + "cm");


        /*Домашнее задание №3
        Написать программу которая вычислит и выведет на экран
        длину окружности, если ее радиус считывается с клавиатуры.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности: ");
        double r = sc.nextDouble();

        double o = 2 * Math.PI * r;
        System.out.println("Длина окружности: " + (float) (o) + " см");
    }
}
