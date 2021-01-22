/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yandex.incoming34.homework3_6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sergei
 */
public class Exercise2Test {

    public Exercise2Test() {
    }

    /**
     * Test of handleArray method, of class Exercise2.
     */
    @Test
    public void testHandleArray1() {
        Exercise2 exercise2 = new Exercise2();
        int[] expected = {5, 6, 7, 8, 9, 10};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, exercise2.handleArray(array4));
    }

    @Test //(expected = NoFourException.class);
    public void testHandleArray2() {
        Exercise2 exercise2 = new Exercise2();
        int[] expected = {5, 6, 7, 8, 9, 10};
        int[] array4 = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, exercise2.handleArray(array4));
    }

    @Test
    public void testHandleArray3() {
        Exercise2 exercise2 = new Exercise2();
        int[] expected = {2, 3, 17, 5, 6, 7, 8, 9, 10};
        int[] array4 = {4, 2, 3, 17, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, exercise2.handleArray(array4));
    }

    @Test
    public void testHandleArray4() {
        Exercise2 exercise2 = new Exercise2();
        int[] expected = new int[0];
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4};
        assertArrayEquals(expected, exercise2.handleArray(array4));
    }

}
