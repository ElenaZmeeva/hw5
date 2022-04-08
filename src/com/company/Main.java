package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 1,2
        int[] mas = new int[3];
        mas[0] = 1;
        mas[1] = 2;
        mas[2] = 3;
        for (int m = 0; m < mas.length; m++) {
            System.out.print(mas[m]);
            if (m != mas.length - 1) System.out.print(", ");
        }
        System.out.println();

        double[] M = {1.57, 7.654, 9.986};
        for (int D = 0; D < M.length; D++) {
            System.out.print(M[D]);
            if (D != M.length - 1) System.out.print(", ");
        }
        System.out.println();

        int[] degree = {23, 25, 25, 24};
        for (int K = 0; K < degree.length; K++) {
            System.out.print(degree[K]);
            if (K != degree.length - 1) System.out.print(", ");
        }
        System.out.println();

        //Task 3
        for (int m = mas.length - 1; m >= 0; m--) {
            System.out.print(mas[m]);
            if (m != 0) System.out.print(", ");
        }
        System.out.println();

        for (int D = M.length - 1; D >= 0; D--) {
            System.out.print(M[D]);
            if (D != 0) System.out.print(", ");
        }
        System.out.println();

        for (int K = degree.length-1; K>=0; K--) {
            System.out.print(degree[K]);
            if (K !=0) System.out.print(", ");
        }
        System.out.println();

        //Task 4
        int[] K = {1, 2, 3};
        for (int i = 0; i < K.length; i++) {
            if (K[i] % 2 == 0) {
                System.out.print(K[i] + " ");
            } else System.out.print(K[i] + 1 + " ");
            if (i != K.length - 1) System.out.print(", ");
        }
    }
}

