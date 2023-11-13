package src;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int scan = scanner.nextInt();
        int[] Massiv = new int[scan];
        System.out.println("выберите способ заполнения массива 1 или 2");
        int v = scanner.nextInt();
        v %= 2;
        if (v == 1) {
            for (int i = 0; i < Massiv.length; i++) {
                Massiv[i] = random.nextInt(101); // Присвоить значение от 0 до 100
            }
        } else {
            for (int i = 0; i < Massiv.length; i++) {
                Massiv[i] = scanner.nextInt();
            }
        }
        for (int i = 0; i < Massiv.length; i++) {
            System.out.print(Massiv[i] + " ");
        }
        System.out.println("");
        // задача 1
        System.out.println("обратный порядок");
        for (int i = Massiv.length - 1; i >= 0; i--) {
            System.out.print(Massiv[i] + " ");
        }
        System.out.println("");

        //ЗАДАЧА 2 и 3
        int max = Massiv[0];
        int index_max = 0;
        for (int i = 1; i < Massiv.length; i++) {
            if (max < Massiv[i]) {
                index_max = i;
                max = Massiv[i];
            }

        }
        System.out.println("Максимальный элемент : " + max + " Инд макс " + index_max);
        int min = Massiv[0];
        int index_min = 0;
        for (int i = 1; i < Massiv.length; i++) {
            if (min > Massiv[i]) {
                index_min = i;
                min = Massiv[i];
            }
        }
        System.out.println("Минимальный элемент : " + min + " Инд мин " + index_min);


    }

}
