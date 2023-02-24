/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module4inclass;

import java.util.Scanner;

/**
 *
 * @author itlabs
 */
import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int[] ranges = new int[9];

        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = 0;
        }

        System.out.println("Enter gross sales (-1 to exit): ");
        double sales = user.nextDouble();

        while (sales != -1) {
            double salary = 200 + (0.09 * sales);
            int range = (int) salary / 100;

            if (range > 8) {
                range = 8;
            }

            ranges[range]++;
            System.out.println("Enter gross sales here: ");
            sales = user.nextDouble();
        }

        System.out.println("Salary Range\tNumber of Salespeople");
        for (int i = 0; i < ranges.length; i++) {
            int lower = (i * 100) + 200;
            int upper = (i * 100) + 299;
            if (i == 8) {
                upper = 1000;
            }
            System.out.printf("$%d-$%d\t\t%d\n", lower, upper, ranges[i]);
        }
    }
}

