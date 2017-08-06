/**
*		Общение одиноких массивов
*	1. Создать массив на 10 строк.
*	2. Создать массив на 10 чисел.
*	3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
*	4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
*
*		Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*
*
*		Требования:
*	1.Программа должна создавать массив на 10 строк.
*	2.Программа должна создавать массив на 10 целых чисел.
*	3.Программа должна считывать строки для массива с клавиатуры.
*	4.Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
*/

package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
*	Общение одиноких массивов
*	@version 0.1 2017.08.06
*	@author Константин
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[10];
        int[] j = new int[10];
        for(int i = 0; i < s.length; i++){
            s[i] = sc.readLine();
            j[i] = s[i].length();
        }
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }
    }
}
