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
public class NoFourException extends Exception {

    public NoFourException() {
        System.out.println("Массив не содержит цифры \"4.\" ");
    }

}
