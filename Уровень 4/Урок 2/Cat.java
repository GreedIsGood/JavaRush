/**
*		Реализовать метод setName
*	Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name равное переданному параметру String name.
*
*
*		Требования:
*	1.Класс Cat должен содержать только одну переменную name.
*	2.Переменная name должна иметь модификатор доступа private и тип String.
*	3.Класс Cat должен содержать только два метода setName и main.
*	4.Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
*/

package com.javarush.task.task04.task0403;

/** 
*	Реализовать метод setName
*	@version 0.1 2017.07.16
*	@author Константин
*/

public class Cat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
