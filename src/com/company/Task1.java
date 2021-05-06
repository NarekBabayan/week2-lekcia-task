package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[10][15];
        int sum = 0;

        for(int i = 0; i<matrix.length;i++){
            for (int j = 0; j<matrix.length;j++){
                matrix[i][j] =(int) Math.random() * (50 + 1) + 55;
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }
}
