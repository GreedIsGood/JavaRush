package com.javarush.task.task03.task0322;


/* 
Большая и чистая

Большая и чистая
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя name1.
4. Выведенный текст должен содержать введенное имя name2.
5. Выведенный текст должен содержать введенное имя name3.
6. Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        
        System.out.println(name + " + " + name1 + " + " + name2 + " = Чистая любовь, да-да!");
    }
}