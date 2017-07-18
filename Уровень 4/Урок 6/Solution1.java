/**
*		Максимум четырех чисел
*	Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*	Если числа равны между собой, необходимо вывести любое.
*
*
*		Требования:
*	1.Программа должна считывать числа c клавиатуры.
*	2.Программа должна выводить число на экран.
*	3.Программа должна выводить на экран максимальное из четырёх чисел.
*	4.Если числа равны между собой, необходимо вывести любое.
*/

package com.javarush.task.task04.task0419;

/** 
*	Максимум четырех чисел
*	@version 0.1 2017.07.18
*	@author Константин
*/

import java.util.Scanner;
import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(maxInt(a, b, c, d));
    }
    
    public static int maxInt(int a, int b, int c, int d){
        int q = a > b ? a : b;
        q = q > c ? q : c;
        q = q > d ? q : d;
        return q;
    }
}
