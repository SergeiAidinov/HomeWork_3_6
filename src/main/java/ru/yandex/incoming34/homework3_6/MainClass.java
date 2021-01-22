/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yandex.incoming34.homework3_6;

/**
 *
 * @author sergei
 */
public class MainClass {
    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        int[] array = {1,4,1,4};
        System.out.println(exercise3.checkArray(array));
        int[] array1 = {1,1,1,4,4,4};
        System.out.println(exercise3.checkArray(array1));
        int[] array2 = {1,4,1,4,17};
        System.out.println(exercise3.checkArray(array2));
        int[] array3 = {1,4,4};
        System.out.println(exercise3.checkArray(array3));
    }
    
}
