/**
*		Геттеры и сеттеры для класса Dog
*	Создать class Dog. У собаки должна быть кличка String name и возраст int age.
*	Создайте геттеры и сеттеры для всех переменных класса Dog.
*
*
*		Требования:
*	1.Программа не должна считывать данные с клавиатуры.
*	2.У класса Dog должна быть переменная name с типом String.
*	3.У класса Dog должна быть переменная age с типом int.
*	4.У класса должен сеттер для переменной name.
*	5.У класса должен геттер для переменной name.
*	6.У класса должен сеттер для переменной age.
*	7.У класса должен геттер для переменной age.
*/

package com.javarush.task.task05.task0503;


/**
*	Геттеры и сеттеры для класса Dog
*	@version 0.1 2017.07.26
*	@author Константин
*/

public class Dog2 {
    String name;
    int age;

    public static void main(String[] args) {

    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
}