package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее

Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число1.
5. Выведенный текст должен содержать введенное число2.
6. Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String name = reader.readLine();
        int many = Integer.parseInt(reader.readLine());
        int age = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает "+ many + " через "+ age + " лет.");
    }
}
