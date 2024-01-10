package com.example.druzhinina_120_3_2;

public class Random {
    public static String ran (String one, String two,String three, String four, String five, String six, String seven, String eight, String nine, String ten, String eleven, String twelve, String thirteen, String fourteen, String fifteen) {
        int resultInt=0;
        resultInt = (int) (1 + Math.random() * 15);
       while (resultInt== Integer.parseInt(one)
                || resultInt ==Integer.parseInt(two)
                || resultInt ==Integer.parseInt(three)
                || resultInt ==Integer.parseInt(four)
                || resultInt ==Integer.parseInt(five)
                || resultInt ==Integer.parseInt(six)
                || resultInt ==Integer.parseInt(seven)
                || resultInt ==Integer.parseInt(eight)
                || resultInt ==Integer.parseInt(nine)
                || resultInt ==Integer.parseInt(ten)
                || resultInt ==Integer.parseInt(eleven)
                || resultInt ==Integer.parseInt(twelve)
                || resultInt ==Integer.parseInt(thirteen)
                || resultInt ==Integer.parseInt(fourteen)
                || resultInt ==Integer.parseInt(fifteen)) {
           resultInt = (int) (1 + Math.random() * 15);
        }
        return String.valueOf(resultInt);
    }
    public static String trueResult (String one, String two,String three, String four, String five, String six, String seven, String eight, String nine, String ten, String eleven, String twelve, String thirteen, String fourteen, String fifteen) {
        int resultInt=0;
        resultInt = (int) (1 + Math.random() * 15);
        if (1== Integer.parseInt(one)
                && 2 ==Integer.parseInt(two)
                && 3 ==Integer.parseInt(three)
                && 4 ==Integer.parseInt(four)
                && 5 ==Integer.parseInt(five)
                && 6 ==Integer.parseInt(six)
                && 7 ==Integer.parseInt(seven)
                && 8 ==Integer.parseInt(eight)
                && 9 ==Integer.parseInt(nine)
                && 10 ==Integer.parseInt(ten)
                && 11 ==Integer.parseInt(eleven)
                && 12 ==Integer.parseInt(twelve)
                && 13 ==Integer.parseInt(thirteen)
                && 14 ==Integer.parseInt(fourteen)
                && 15 ==Integer.parseInt(fifteen)) {
            resultInt = 99;
        } else if (1== Integer.parseInt(one)
                && 2 ==Integer.parseInt(two)
                && 3 ==Integer.parseInt(three)
                && 4 ==Integer.parseInt(four)
                && 5 ==Integer.parseInt(five)
                && 6 ==Integer.parseInt(six)
                && 7 ==Integer.parseInt(seven)
                && 8 ==Integer.parseInt(eight)
                && 9 ==Integer.parseInt(nine)
                && 10 ==Integer.parseInt(ten)
                && 11 ==Integer.parseInt(eleven)
                && 12 ==Integer.parseInt(twelve)
                && 13 ==Integer.parseInt(thirteen)
                && 15 ==Integer.parseInt(fourteen)
                && 14 ==Integer.parseInt(fifteen)) {
            resultInt = 99;
        }
        return String.valueOf(resultInt);
    }
}
