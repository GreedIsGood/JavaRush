/**
*		День недели
*	Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
*	«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
*	если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
*
*		Пример для номера 5:
*	пятница
*
*		Пример для номера 10:
*	такого дня недели не существует
*
*
*		Требования:
*	1.Программа должна считывать число c клавиатуры.
*	2.Программа должна выводить текст на экран.
*	3.Если введено число от 1 до 7, необходимо вывести день недели.
*	4.Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
*/

package com.javarush.task.task04.task0413;

/**
*	День недели
*	@version 0.1 2017.07.17
*	@author Константин
*/
import java.util.Scanner;
import java.io.*;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("такого дня недели не существует");
                break;
        }
    }
}