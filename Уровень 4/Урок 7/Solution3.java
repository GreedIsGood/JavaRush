/**
*		Положительные и отрицательные числа
*	Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
*	в следующем виде:
*	«количество отрицательных чисел: а», «количество положительных чисел: б»,
*	где а, б — искомые значения.
*
*		Пример для чисел 2 5 6:
*	количество отрицательных чисел: 0
*	количество положительных чисел: 3
*
*		Пример для чисел -2 -5 6:
*	количество отрицательных чисел: 2
*	количество положительных чисел: 1
*
*
*		Требования:
*	1.Программа должна считывать числа c клавиатуры.
*	2.Программа должна выводить текст на экран.
*	3.Программа должна выводить количество отрицательн
*/

package com.javarush.task.task04.task0429;

/**
*	Положительные и отрицательные числа
*	@version 0.1 2017.07.19
*	@author Константин
*/

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m1 = Integer.parseInt(br.readLine());
        int m2 = Integer.parseInt(br.readLine());
        int m3 = Integer.parseInt(br.readLine());
        int result_minus = 0;
        int result_plus = 0;
        if (m1 > 0) result_plus++;
        if (m1 < 0) result_minus++;
        if (m2 > 0) result_plus++;
        if (m2 < 0) result_minus++;
        if (m3 > 0) result_plus++;
        if (m3 < 0) result_minus++;

        System.out.println("количество отрицательных чисел: " + result_minus+"\n" +
                            "количество положительных чисел: " + result_plus);

    }
}
