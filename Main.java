package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float fnum,snum;
        Scanner a = new Scanner(System.in);
        System.out.println("\nEnter Your First Number\n");
        fnum= a.nextFloat();
        System.out.println("\nEnter the Second Number\n");
        snum = a.nextFloat();
        System.out.println("\nAddition Result is = "+(fnum+snum));
        if (snum>fnum)
        {
            System.out.println("\nSubstraction Resul is = " + ((fnum - snum)*-1));
        }
        else
        {
        System.out.println("\nSubstraction Result is = " + ((fnum - snum)));
    }
        System.out.println("\nMultiplication Result is = " + ((fnum * snum)));
        System.out.println("\nDivision Result is = " + ((fnum/snum)));


    }

}