/**
*		Мужчина и женщина
*	1. Внутри класса Solution создай public static классы Man и Woman.
*	2. У классов должны быть поля: name (String), age (int), address (String).
*	3. Создай конструкторы, в которые передаются все возможные параметры.
*	4. Создай по два объекта каждого класса со всеми данными используя конструктор.
*	5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».
*
*
*		Требования:
*	1.В классе Solution создай public static класс Man.
*	2.В классе Solution создай public static класс Woman.
*	3.Класс Man должен содержать переменные: name(String), age(int) и address(String).
*	4.Класс Woman должен содержать переменные: name(String), age(int) и address(String).
*	5.У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
*	6.Конструкторы должны инициализировать переменные класса.
*	7.В методе main необходимо создать по два объекта каждого типа.
*	8.Метод main должен выводить созданные объекты на экран в указанном формате.
*/

package com.javarush.task.task05.task0526;

/**
*	Мужчина и женщина
*	@version 0.1 2017.08.02
*	@author Константин
*/

public class Solution1 {
     public static void main(String[] args) {
        Man man = new Man("NaN1", 41, "Lol1");
        Man man1 = new Man("NaN2", 42, "Lol2");
        Woman woman = new Woman("NaN3", 43, "Lol3");
        Woman woman1 = new Woman("NaN4", 44, "Lol4");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name){
            this.name = name;
        }

        public Man(String name, int age){
            this(name);
            this.age = age;
        }

        public Man(String name, int age, String address){
            this(name, age);
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name){
            this.name = name;
        }

        public Woman(String name, int age){
            this(name);
            this.age = age;
        }

        public Woman(String name, int age, String address){
            this(name, age);
            this.address = address;
        }
    }
}
