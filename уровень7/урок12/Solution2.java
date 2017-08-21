/**
*		Минимаксы в массивах
*	Создать массив на 20 чисел.
*	Заполнить его числами с клавиатуры.
*	Найти максимальное и минимальное числа в массиве.
*	Вывести на экран максимальное и минимальное числа через пробел.
*
*
*		Требования:
*	1.Создай массив целых чисел (int[]) на 20 элементов.
*	2.Считай с клавиатуры 20 целых чисел и добавь их в массив.
*	3.Найди и выведи через пробел максимальное и минимальное числа.
*	4.Используй цикл for.
*/

package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*	Минимаксы в массивах
*	@version 0.1 2017.08.09
*	@author Константин
*/

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(reader.readLine());
        int maximum = arr[0];
        int minimum = arr[0];
        for (int x : arr){
            if (x > maximum) maximum = x;
            if (x < minimum) minimum = x;
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
