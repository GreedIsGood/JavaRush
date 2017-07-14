package com.javarush.task.task03.task0318;

/**
*	"План по захвату мира"
*
*		Требования:
*	1.Программа должна выводить текст.
*	2.Программа должна считывать данные с клавиатуры.
*	3.Выведенный текст должен содержать введенное имя.
*	4.Выведенный текст должен содержать введенное число.
*	5.Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;

/**
*
*	Программа для ввода символов с клавиатуры
*	@version 0.1 2017.07.13
*	@author Константин
*
*/
public class Solution {

    public static void main(String[] args) throws Exception {
		
		//Переменная reader для считывания символов при помощи BufferedReader
		
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		//Переменная name хранит имя человека которое вели с клавиатуры
		
        String name = reader.readLine();
		
		//Переменная age хринит число введеное с клавиатуры
		
        String age = reader.readLine();
		
		//Переменная Age хринит число переобразованое из переменной age
		
        int Age = Integer.parseInt(age);
        
        System.out.println(name + " захватит мир через " + Age + " лет. Му-ха-ха!");
        
    }
}
