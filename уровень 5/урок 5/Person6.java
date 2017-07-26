/**
*		Геттеры и сеттеры для класса Person
*	Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
*	Создайте геттеры и сеттеры для всех переменных класса Person.
*
*
*		Требования:
*	1.Программа не должна считывать данные с клавиатуры.
*	2.У класса Person должна быть переменная name с типом String.
*	3.У класса Person должна быть переменная age с типом int.
*	4.У класса Person должна быть переменная sex с типом char.
*	5.У класса должен сеттер для переменной name.
*	6.У класса должен геттер для переменной name.
*	7.У класса должен сеттер для переменной age.
*	8.У класса должен геттер для переменной age.
*	9.У класса должен сеттер для переменной sex.
*	10.У класса должен геттер для переменной sex.
*/

package com.javarush.task.task05.task0508;

/**
*	Геттеры и сеттеры для класса Person
*	@version 0.1 2017.07.26
*	@author Константин
*/

public class Person6 {
    String name;
    int age;
    char sex;

    public static void main(String[] args) {

    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public char getSex(){
        return this.sex;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setSex(char sex){
        this.sex = sex;
    }
}