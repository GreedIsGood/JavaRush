/**
*		Гадание на долларовый счет
*	Вывести на экран квадрат из 10х10 букв S используя цикл while.
*	Буквы в каждой строке не разделять.
*
*		Пример вывода на экран:
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*	SSSSSSSSSS
*
*
*		Требования:
*	1.Программа не должна считывать текст c клавиатуры.
*	2.Программа должна выводить текст на экран.
*	3.Программа должна выводить квадрат из 10х10 букв S
*	4.В программе должен использоваться цикл while.
*/

package com.javarush.task.task04.task0433;


/**
*	Гадание на долларовый счет
*	@version 0.1 2017.07.20
*	@author Константин
*/

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        int a = 10;
        while(a > 0){
            int b = 10;
            while(b > 0){
                System.out.print("S");
                b--;
            }
            System.out.println();
            a--;
        }
    }
}