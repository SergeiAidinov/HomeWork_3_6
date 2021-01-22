/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yandex.incoming34.homework3_6;

import java.util.Arrays;

/**
 *
 * @author sergei
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("Exercise #2");
        Exercise2 exercise2 = new Exercise2();
        int[] array4 = {1,2,3,4,5,6,7,8,9,10};        
        System.out.println(Arrays.toString(exercise2.handleArray(array4)));
        int[] array5 = {1,2,3,5,6,7,8,9,10};        
        System.out.println(Arrays.toString(exercise2.handleArray(array5)));
        int[] array6 = {4,2,3,17,5,6,7,8,9,10};        
        System.out.println(Arrays.toString(exercise2.handleArray(array6)));
        int[] array7 = {1,2,3,4,5,6,7,8,9,10,4};        
        System.out.println(Arrays.toString(exercise2.handleArray(array7)));

        Exercise3 exercise3 = new Exercise3();
        System.out.println("************************");
        System.out.println("Exercise #3");
        int[] array = {1, 4, 1, 4};
        System.out.println(exercise3.checkArray(array));
        int[] array1 = {1, 1, 1, 4, 4, 4};
        System.out.println(exercise3.checkArray(array1));
        int[] array2 = {1, 4, 1, 4, 17};
        System.out.println(exercise3.checkArray(array2));
        int[] array3 = {1, 4, 4};
        System.out.println(exercise3.checkArray(array3));
    }

}
