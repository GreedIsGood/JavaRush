/**	
*		Программист создает человека
*	Создать class Person. У человека должно быть имя String name, возраст int age.
*	Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
*	В методе main создай объект Person, занеси его ссылку в переменную person.
*	Вызови метод initialize с любыми значениями.
*
*
*		Требования:
*	1.Программа не должна считывать данные с клавиатуры.
*	2.У класса Person должна быть переменная name с типом String.
*	3.У класса Person должна быть переменная age с типом int.
*	4.У класса должен быть метод initialize, принимающий в качестве параметра имя, возраст и инициализирующий соответствующие переменные класса.
*	5.Необходимо создать объект типа Person.
*	6.Необходимо вызвать метод initialize у созданного объекта и передать в него какие-либо параметры.
*/

package com.javarush.task.task05.task0514;

/**
*	Программист создает человека
*	@version 0.1 2017.07.29
*	@author Константин
*/

public class Solution5 {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("person", 11);
    }

    static class Person {
        String name;
        int age;
        
        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
