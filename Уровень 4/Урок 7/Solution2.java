/**
*		Положительное число
*	Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
*
*		Пример для чисел -4 6 6:
*	2
*
*		Пример для чисел -6 -6 -3:
*	0
*
*
*		Требования:
*	1.Программа должна считывать числа c клавиатуры.
*	2.Программа должна выводить число на экран.
*	3.Программа должна выводить количество положительных чисел в исходном наборе.
*	4.Если положительных чисел нет, программа должна вывести "0".
*/

package com.javarush.task.task04.task0428;

/**
*	Положительное число
*	@version 0.1 2017.07.19
*	@author Константин
*/

import java.util.Scanner;
import java.io.*;

public class Solution2 {
    
    private static int caunt = 0;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        summ(sc.nextInt());
        summ(sc.nextInt());
        summ(sc.nextInt());
        System.out.println("количество положительных чисел " + caunt);
    }
    
    public static void summ (int a){
        if (a > 0) caunt++;
    }
}