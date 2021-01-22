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
public class Exercise3Test {

    @Test
    public void testCheckArray1() {
        Exercise3 exercise3 = new Exercise3();
        int[] array = {1, 4, 1, 4};
        assertTrue(exercise3.checkArray(array));
    }

    @Test
    public void testCheckArray2() {
        Exercise3 exercise3 = new Exercise3();
        int[] array = {1, 1, 1, 4, 4, 4};
        assertTrue(exercise3.checkArray(array));
    }

    @Test
    public void testCheckArray3() {
        Exercise3 exercise3 = new Exercise3();
        int[] array = {1, 4, 4};
        assertFalse(exercise3.checkArray(array));
    }

    
    @Test
    public void testCheckArray4() {
        Exercise3 exercise3 = new Exercise3();
        int[] array = {1, 4, 4};        
        assert(exercise3.checkArray(array));
    }

}
