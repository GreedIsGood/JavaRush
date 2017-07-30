/**
*		Создать класс Friend
*	Создать класс Friend (друг) с тремя конструкторами:
*	— Имя
*	— Имя, возраст
*	— Имя, возраст, пол
*
*		Примечание:
*	Имя(String), возраст(int), пол(char).
*
*
*		Требования:
*	1.У класса Friend должна быть переменная name с типом String.
*	2.У класса Friend должна быть переменная age с типом int.
*	3.У класса Friend должна быть переменная sex с типом char.
*	4.У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
*	5.У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
*	6.У класса должен быть конструктор, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.
*/

package com.javarush.task.task05.task0516;

/**
*	Друзей не купишь
*	@version 0.1 2017.07.30
*	@author Константин
*/

public class Friend {
    int age;
    String name;
    char sex;

    public static void main(String[] args) {

    }
    
    public Friend(String name){
        this.name = name;
    }
    
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}