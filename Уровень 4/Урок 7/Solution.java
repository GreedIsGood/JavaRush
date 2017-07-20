/**
*		Ярлыки и числа
*	Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
*	«отрицательное четное число» — если число отрицательное и четное,
*	«отрицательное нечетное число» — если число отрицательное и нечетное,
*	«ноль» — если число равно 0,
*	«положительное четное число» — если число положительное и четное,
*	«положительное нечетное число» — если число положительное и нечетное.
*
*		Пример для числа 100:
*	положительное четное число
*
*		Пример для числа -51:
*	отрицательное нечетное число
*
*
*		Требования:
*	1.Программа должна считывать число c клавиатуры.
*	2.Программа должна использовать команду System.out.println() или System.out.print().
*	3.Если число отрицательное и четное, вывести "отрицательное четное число".
*	4.Если число отрицательное и нечетное, вывести "отрицательное нечетное число".
*	5.Если число равно 0, вывести "ноль".
*	6.Если число положительное и четное, вывести "положительное четное число".
*	7.Если число положительное и нечетное, вывести "положительное нечетное число".
*/

package com.javarush.task.task04.task0426;

/**
*	Ярлыки и числа
*	@version 0.1 2017.07.19
*	@author Константин
*/

import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0)
            System.out.println("ноль");
        else if (a > 0){
            if(a % 2 == 0)
                System.out.println("положительное четное число");
            else 
                System.out.println("положительное нечетное число");
        } else {
            if(a % 2 == 0)
                System.out.println("отрицательное четное число");
            else 
                System.out.println("отрицательное нечетное число");
        }
    }
}