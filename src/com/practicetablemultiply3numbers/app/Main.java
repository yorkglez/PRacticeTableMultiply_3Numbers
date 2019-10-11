package com.practicetablemultiply3numbers.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Declarations
        byte start = 0;
        byte end = 0;
        byte limitNum = 0;
        int result = 0;

        //Implements scanner
        Scanner In = new Scanner(System.in);

        //Input from user
        System.out.println("Write the start table: ");
        start = In.nextByte();
        System.out.println("Write the end table: ");
        end = In.nextByte();
        System.out.println("Write the limit: ");
        limitNum = In.nextByte();

        //Process
        for(; start <= end; start++){
            for(byte count = 1; count <= limitNum; count++){
                result = count * start;

                //Output results
                System.out.println(String.format("%d x %d = %d",start,count,result));
            }
            System.out.println();
        }
        //Close input
        In.close();
    }
}
