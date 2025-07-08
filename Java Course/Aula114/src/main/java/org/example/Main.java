package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int i = 0, n = 7;

        do {
            i++;
            if(i == 4){
                System.out.println("it was shipped");
            }else{
                System.out.println(i);
            }

        } while(i <= n);

        int r = 0, t = 7;

        do {
            r++;
            if(r == 4){
                System.out.println(r);
            }else{
                continue;
               // System.out.println("it was shipped");
            }

        } while(r <= t);

    }

        /* it executes until while to be satisfied or condition not true
        * if var i is greater than 4, that while will not execute */
    }

