/**
*		Создать класс прямоугольник (Rectangle)
*	Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
*	Создать для него как можно больше методов конструкторов.
*
*		Примеры:
*	— заданы 4 параметра: left, top, width, height
*	— ширина/высота не задана (оба равны 0)
*	— высота не задана (равно ширине) создаём квадрат
*	— создаём копию другого прямоугольника (он и передаётся в параметрах)
*
*
*		Требования:
*	1.У класса Rectangle должны быть переменные top, left, width и height с типом int.
*	2.У класса должен быть хотя бы один конструктор.
*	3.У класса должно быть хотя бы два конструктора.
*	4.У класса должно быть хотя бы три конструктора.
*	5.У класса должно быть хотя бы четыре конструктора.
*/

package com.javarush.task.task05.task0520;

/**
*	Создать класс прямоугольник (Rectangle)
*	@version 0.1 2017.07.30
*	@author Константин
*/


public class Rectangle4 {
    int  top, left, width, height;

    public static void main(String[] args) {

    }
    
    public Rectangle(int top){
        this.top = top;
        this.left = top;
        this.width = top;
        this.height = top;
    }
    
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle(Rectangle other){
        this.top = other.top;
        this.left = other.left;
        this.width = other.width;
        this.height = other.height;
    }
    
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    
        public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
}