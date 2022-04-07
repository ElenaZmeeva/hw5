package com.company;

public class Main {

    public static void main(String[] args) {
	//Task 1,2
        int [] mas = new int[3];
        mas[0] = 1;
        mas[1] = 2;
        mas[2] = 3;
        System.out.print(mas [0]+ ", ");
        System.out.print(mas [1]+ ", ");
        System.out.println(mas [2]);
        System.out.println();

        double [] M = { 1.57, 7.654, 9.986};
        System.out.print(M[0]+ ", ");
        System.out.print(M[1]+ ", ");
        System.out.println(M[2]);
        System.out.println();

        int [] degree = {23, 25, 25, 24 };
        System.out.print( degree[0] + ", ");
        System.out.print(degree[1]+", ");
        System.out.print(degree[2] +", ");
        System.out.println(degree[3]);
        System.out.println();

        //Task 3
        System.out.print(mas [2]+ ", ");
        System.out.print(mas [1]+ ", ");
        System.out.println(mas [0]);
        System.out.println();
        System.out.print(M[2]+ ", ");
        System.out.print(M[1]+ ", ");
        System.out.println(M[0]);
        System.out.println();
        System.out.print( degree[3] + ", ");
        System.out.print(degree[2]+", ");
        System.out.print(degree[1] +", ");
        System.out.println(degree[0]);

        //Task 4
int [] K = {1, 2, 3};
        for (int i = 0; i<=K.length; i++) {
            if (i % 2==0 ){
                System.out.print(i +", ");
            }else {
                System.out.print(i+1 +", ");
            }

        }
    }
}
