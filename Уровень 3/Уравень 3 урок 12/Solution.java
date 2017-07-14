/**
*	Сумма цифр трехзначного числа
*	Реализуй метод sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
*
*		Пример:
*	Метод sumDigitsInNumber вызывается с параметром 546.
*
*		Пример вывода:
*	15
*
*
*		Требования:
*	1.Метод sumDigitsInNumber(int) должен быть публичным и статическим.
*	2.Метод sumDigitsInNumber должен возвращать значение типа int.
*	3.Метод sumDigitsInNumber не должен ничего выводить на экран.
*	4.Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*
*/

package com.javarush.task.task01.task0132;

/** 
*
*	Сумма цифр трехзначного числа
*	@version 0.1 2017.07.14
*	@author Константин
*
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
		// Переменная для получения еденицы
        int unit = number - ((number / 10)*10);
		// Переменная для получения Десяток
        int dozens = (number / 10) - ((number / 10)/10) * 10;
		// Переменная для получения соток
        int handred = number / 100;
		
        return unit + dozens + handred;
    }
}