/**
*		Чётные и нечётные циферки
*	Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
*	Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
*	Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
*	Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
*	Вывести на экран сообщение: «Even: а Odd: b», где а — количество четных цифр, b — количество нечетных цифр.
*
*		Пример для числа 4445:
*	Even: 3 Odd: 1
*
*
*		Требования:
*	1.Программа должна считывать данные с клавиатуры.
*	2.Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
*	3.Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
*	4.Программа должна выводить текст на экран.
*	5.Выведенный текст должен соответствовать заданию.
*/

package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/**
*	Чётные и нечётные циферки
*	@version 0.1 2017.08.02
*	@author Константин
*/

public class Solution4 {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char [] arr = a.toCharArray();
        int [] arint = new int[a.length()];
        for (int i = 0; i < arr.length; i++) {
            arint[i] = arr[i];
        }
        for (int i = 0; i < arint.length; i++) {
            if(arint[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
