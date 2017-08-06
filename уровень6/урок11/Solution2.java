/**
*		Феншуй и статики
*	Переставь один модификатор static, чтобы пример скомпилировался.
*
*
*		Требования:
*	1.Метод main менять нельзя.
*	2.Добавь модификатор static в нужное место.
*	3.Убери лишний модификатор static.
*	4.В программе должно быть только 2 модификатора static.
*/

package com.javarush.task.task06.task0615;

/**
*	Феншуй и статики
*	@version 0.1 2017.08.03
*	@author Константин
*/

public class Solution2 {

    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}