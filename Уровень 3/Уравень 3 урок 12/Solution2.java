/**		
*		Финансовые ожидания
*	Ввести с клавиатуры число n.
*	Вывести на экран надпись «Я буду зарабатывать $n в час».
*
*		Пример:
*	Я буду зарабатывать $50 в час
*
*
*		Требования:
*	1.Программа должна выводить текст.
*	2.Программа должна считывать данные с клавиатуры.
*	3.Выведенный текст должен содержать введенное число n.
*	4.Выведенный тест должен полностью соответствовать заданию.
*/

package com.javarush.task.task03.task0325;

import java.io.*;

/** 
*	Финансовые ожидания
*	@version 0.1 2017.07.14
*	@author Константин
*/


public class Solution2 {
    public static void main(String[] args) throws Exception {
		// Поток для чтения данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Переменая содержашая численный результат веденный с клавиатуры
        int n = Integer.parseInt(reader.readLine());
		
        System.out.println("Я буду зарабатывать $"+ n + " в час");
    }
}
