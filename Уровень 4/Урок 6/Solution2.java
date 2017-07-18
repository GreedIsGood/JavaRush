/**
*		Сортировка трех чисел
*	Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*	Выведенные числа должны быть разделены пробелом.
*
*
*		Требования:
*	1.Программа должна считывать числа c клавиатуры.
*	2.Программа должна выводить числа на экран.
*	3.Выведенные числа должны быть разделены пробелом.
*	4.Программа должна выводить числа в порядке убывания.
*/

package com.javarush.task.task04.task0420;

/**
*	Сортировка трех чисел
*	@version 0.1 2017.07.18
*	@author Константин
*/

import java.util.Scanner;
import java.io.*;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b && a > c)
            if(b > c)
                System.out.println(a + " " + b + " " + c);
            else 
                System.out.println(a + " " + c + " " + b);
        
        if (b > a && b > c)
            if(a > c)
                System.out.println(b + " " + a + " " + c);
            else 
                System.out.println(b + " " + c + " " + a);
     
        if (c > a && c > b)
            if(a > b)
                System.out.println(c + " " + a + " " + b);
            else 
                System.out.println(c + " " + b + " " + a);
    }
}
