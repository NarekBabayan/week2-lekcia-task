package com.company;

import java.util.Scanner;

public class Task1 {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int [1000];
        int index= 0;

        for(int i= 7; ;i++){
            if(index<=myArray.length-1) {
                if (i % 7 == 0) {
                    myArray[index] = i;
                    index++;
                }
            }else{
                break;
            }

        }

        for(int i = 0; i<=myArray.length-1;i++){
            System.out.print(myArray[i]+" ");
        }


    }
}
