/**
*		Минимум двух чисел
*	Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*	Если два числа равны между собой, необходимо вывести любое.
*
*
*		Требования:
*	1.Программа должна считывать числа c клавиатуры.
*	2.Программа должна выводить число на экран.
*	3.Программа должна выводить на экран минимальное из двух чисел.
*	4.Если два числа равны между собой, необходимо вывести любое.
*/

package com.javarush.task.task04.task0418;

/**
*	Минимум двух чисел
*	@version 0.1 2017.07.18
*	@author Константин
*/

import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? b : a);
    }
}