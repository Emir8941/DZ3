package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] digits = {1.2,-3.4,5.9,8.7,6.5,4.3,-2.1,-2.5,3.2,4.2,-43.,1.2,-3.1,4.3,4.3};
        double big = 0.0;
        int num = 0;
        boolean isMouse = false;

        for (double g:digits) {
            if (g< 0){
                isMouse = true;
            }
            else if (isMouse){
                big = big + g;
                num++;
                double finish = big /num;
                System.out.println("ответ:"+ finish);
                boolean isFas = false;
                while (isFas){
                    isFas = true;
                    for (int i = 1; i < digits.length; i++) {
                        if (digits[i]< digits[i - 1]){
                            double  bi= digits[i];
                            digits[i] =digits[i-1];
                            digits[i - 1] = bi;
                            isFas = false;
                            


                        }
                        System.out.println(Arrays.toString(digits));
                        System.out.print(digits+",");

                    }
                }

            }

        }










    }









}