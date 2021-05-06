package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] matrix = new int[3][3];

        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix.length;j++){
                matrix[i][j] =(int) random.nextInt( 3);
            }
        }


        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix.length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }


        int sum = 0;
        int size = matrix.length-1;
        for(int i = 0; i<matrix.length;i++){

            for (int j =0;j<size;j++){
                sum = sum + matrix[i][j];
            }
            size--;
        }

        int sum2 = 0;
        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix.length;j++){
                sum2 = sum2 + matrix[i][j];
            }
        }
        System.out.println(sum2-sum);

    }
}
