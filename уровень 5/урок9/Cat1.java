/**
*		Конструируем котиков
*	Создать класс Cat (кот) с пятью конструкторами:
*	— Имя,
*	— Имя, вес, возраст
*	— Имя, возраст (вес стандартный)
*	— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
*	— вес, цвет, адрес (чужой домашний кот)
*		
*		Задача конструктора – сделать объект валидным.
*	Например, если вес не известен, то нужно указать какой-нибудь средний вес.
*	Кот не может ничего не весить.
*	То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*		
*		
*		Требования:
*	1.У класса Cat должна быть переменная name с типом String.
*	2.У класса Cat должна быть переменная age с типом int.
*	3.У класса Cat должна быть переменная weight с типом int.
*	4.У класса Cat должна быть переменная address с типом String.
*	5.У класса Cat должна быть переменная color с типом String.
*	6.У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
*/

package com.javarush.task.task05.task0517;

/** 
*	Конструируем котиков
*	@version 0.1 2017.07.30
*	@author Константин
*/

public class Cat1 {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public static void main(String[] args) {

    }
    
    public Cat(String name){
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "blue";
    }
    
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "blue";
    }
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "blue";
    }
    
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }
    
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }
}