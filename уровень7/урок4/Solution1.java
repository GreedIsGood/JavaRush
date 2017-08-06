/**
*		Массив из строчек в обратном порядке
*	1. Создать массив на 10 строк.
*	2. Ввести с клавиатуры 8 строк и сохранить их в массив.
*	3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.
*
*
*		Требования:
*	1.Программа должна создавать массив на 10 строк.
*	2.Программа должна считывать строки для массива с клавиатуры.
*	3.Программа должна выводить 10 строк, каждую с новой строки.
*	4.Все строки массива (10 элементов) должны быть выведены в обратном порядке.
*/

package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
*	Массив из строчек в обратном порядке
*	@version 0.1 2017.08.06
*	@author Константин
*/

public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String [] s = new String[10];
        for (int i = 0; i < 8; i++) s[i] = sc.next();
        for (int i = 0; i < s.length; i++) System.out.println(s[9 - i]);
    }
}