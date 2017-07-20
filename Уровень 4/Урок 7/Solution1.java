/**
*		Описываем числа
*	Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
*	«четное однозначное число» — если число четное и имеет одну цифру,
*	«нечетное однозначное число» — если число нечетное и имеет одну цифру,
*	«четное двузначное число» — если число четное и имеет две цифры,
*	«нечетное двузначное число» — если число нечетное и имеет две цифры,
*	«четное трехзначное число» — если число четное и имеет три цифры,
*	«нечетное трехзначное число» — если число нечетное и имеет три цифры.
*	Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.
*
*		Пример для числа 100:
*	четное трехзначное число
*
*		Пример для числа 51:
*	нечетное двузначное число
*
*
*		Требования:
*	1.Программа должна считывать одно число c клавиатуры.
*	2.Программа должна использовать команду System.out.println() или System.out.print().
*	3.Если число четное и имеет одну цифру, вывести "четное однозначное число".
*	4.Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
*	5.Если число четное и имеет две цифры, вывести "четное двузначное число".
*	6.Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
*	7.Если число четное и имеет три цифры, вывести "четное трехзначное число".
*	8.Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
*	9.Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
*/

package com.javarush.task.task04.task0427;

/**
*	Описываем числа
*	@version 0.1 2017.07.19
*	@author Константин
*/

import java.util.Scanner;
import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0 && a <= 9){
            if(a % 2 == 0) System.out.println("четное однозначное число");
            else System.out.println("нечетное однозначное число");
        } else if (a >= 10 && a <= 99){
            if(a % 2 == 0) System.out.println("четное двузначное число");
            else System.out.println("нечетное двузначное число");
        } else if (a >= 100 && a <= 999){
            if(a % 2 == 0) System.out.println("четное трехзначное число");
            else System.out.println("нечетное трехзначное число");
        }
    }
}
