package com.company;
import java.util.*;

public class Main {ёё

    public static void main(String[] args) {
        int b = 0;
        int k = 0;
        int size = 3;
        List<ArrayList<Integer>> a = new ArrayList<>();

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();


        a1.add(2);
        a1.add(2);
        a1.add(3);

        a2.add(4);
        a2.add(1);
        a2.add(6);

        a3.add(5);
        a3.add(8);
        a3.add(9);

        a.add(a1);
        a.add(a2);
        a.add(a3);


        for (ArrayList obj : a) {

            ArrayList<Integer> temp = obj;

            for (Integer job : temp) {
                System.out.print(job + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; ++i) {
            k += a.get(i).get(i);
            b += a.get(size - 1 - i).get(i);
        }
        k /= size;
        b /= size;
        System.out.println("Среднее арифметическое главной матрицы: " + k);
        System.out.println("Среднее арифметическое побочной матрицы: " + b);
        System.out.println("Наибольшее значение записываем в середину матрицы: ");
        if (k > b) {
            a.get((int) Math.ceil(size / 2)).set((int) Math.ceil(size / 2), k);
        } else {
            a.get((int) Math.ceil(size / 2)).set((int) Math.ceil(size / 2), b);
        }
        for (ArrayList obj : a) {

            ArrayList<Integer> temp = obj;

            for (Integer job : temp) {
                System.out.print(job + " ");
            }
            System.out.println();
        }
    }
}




