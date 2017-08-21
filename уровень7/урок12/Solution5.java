/**
*		Семейная перепись
*	Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
*
*		Примечание:
*	Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*
*		Пример вывода:
*	Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
*	Имя: Катя, пол: женский, возраст: 55
*	Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
*	…
*
*
*		Требования:
*	1.Программа не должна считывать данные с клавиатуры.
*	2.Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
*	3.Добавить в класс конструктор public Human(String name, boolean sex, int age).
*	4.Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
*	5.Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
*	6.Выведи созданные объекты на экран.
*/

package com.javarush.task.task07.task0724;

/**
*	Семейная перепись
*	@version 0.1 2017.08.09
*	@author Константин
*/

public class Solution5 {
    public static void main(String[] args) {
        Human ana = new Human("Ana", false, 43);
        Human aka = new Human("Aka", false, 44);
        Human ala = new Human("Ala", false, 42);
        Human ara = new Human("Ara", true, 45);
        Human nara = new Human("Nara", true, 12, ara, ana);
        Human kara = new Human("Kara", false, 13, ara, aka);
        Human sara = new Human("Sara", true, 11, ara, ala);
        Human lara = new Human("Lara", false, 14, ara, ala);
        Human rara = new Human("Rara", true, 15, ara, ala);
        System.out.println(ana.toString());
        System.out.println(aka.toString());
        System.out.println(ala.toString());
        System.out.println(ara.toString());
        System.out.println(nara.toString());
        System.out.println(kara.toString());
        System.out.println(sara.toString());
        System.out.println(lara.toString());
        System.out.println(rara.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }
        
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}