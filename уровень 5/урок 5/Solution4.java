/**
*		Кошачья бойня
*	Создать три кота используя класс Cat.
*	Провести три боя попарно между котами.
*	Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
*	Результат каждого боя вывести на экран c новой строки.
*
*
*		Требования:
*	1.Программа не должна считывать данные с клавиатуры.
*	2.Нужно создать три объекта типа Cat.
*	3.Нужно провести три боя.
*	4.Программа должна вывести результат каждого боя с новой строки.
*/

package com.javarush.task.task05.task0505;

/**
*	Кошачья бойня
*	@version 0.1 2017.07.26
*	@author Константин
*/

public class Solution4 {
    public static void main(String[] args) {
        Cat cat = new Cat("vasa", 12, 11, 13);
        Cat cat1 = new Cat("vasa", 11, 10, 12);
        Cat cat2 = new Cat("vasa", 10, 9, 14);
        System.out.println(cat.fight(cat1));
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}