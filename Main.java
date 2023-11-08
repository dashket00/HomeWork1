import java.text.BreakIterator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*  11111111  Напишите программу, которая будет принимать на вход число из консоли и на выход
        будет выводить сообщение четное число или нет. Для определения четности числа
        используйте операцию получения остатка от деления (операция выглядит так: '% 2').


        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int a = scanner.nextInt();
        if (a%2==0){
        System.out.println("число четное");}
                else   System.out.println("число нечетное"); */




        /*   Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
                Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold»




        Scanner scanner = new Scanner(System.in);
        System.out.println("температура на улице");
        int t = scanner.nextInt();
        if (t >= -5){
            System.out.println("warm");}
        else {
            if(t >= -20){
            System.out.println("normal");
        }
        else {
            if( t <= -20){
                    System.out.println("cold");
                }
            }*/


        /*  Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно

        int t;
        for (t = 10; t<=20; t++){
        System.out.println(t*t);}    */


        /* Необходимо, чтоб программа выводила на экран вот такую последовательность:
            7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

        int i = 1;
        while (i<=14) {
            System.out.println(i * 7);
            i++;
        } */


        /*  Напишите программу, где пользователь вводит любое целое положительное число. А
            программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
            числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
            ввести некорректные данные. */

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int a = scanner.nextInt();
        if (a < 1){
            System.out.println("Неверный формат");
        } else {
            int i;
            int sum = 0;
            for (i=1; i<a; i++){
                sum += i;
            }
            System.out.println(sum);
        }
        */
    }


    }
