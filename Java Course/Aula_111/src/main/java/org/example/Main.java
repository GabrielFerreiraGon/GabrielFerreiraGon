package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 0 1 1 2 3 5 8 13
        * int p = 0;
        * int v2 = 1;
        * int 1; (0) was created with value 0
        * -----------------------------------
            * r1 = p + v2; | r1 = 1
            * print r1
            * p = v2;
            * v2 = r1 (p1 + v2)
            * -------
            * print  r1
        */
        int p1 = 0;
        int v1 = 1;
        int r1;
        System.out.println("Enter with a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a == 1){
            System.out.print(p1);
        }
        else{

            System.out.printf(" %d %d", p1 , v1);
            for (int i = 3; i <= a; i++){
                r1 = p1 + v1;
                System.out.print(" " + r1);
                p1 = v1;
                v1 = r1;
            }

        }

        }
    }
