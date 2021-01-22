/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.yandex.incoming34.homework3_6;

import com.google.common.primitives.Ints;
import java.util.ArrayList;
import static java.util.Collections.reverse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergei
 */
public class Exercise2 {

    public int[] handleArray(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = (array.length - 1); i > - 1; i--) {
            if (array[i] == 4) {
                break;
            } else {
                if (i == 0) {
                    try {
                        throw new NoFourException();
                    } catch (NoFourException ex) {

                    }
                } else {
                    list.add(array[i]);
                }

            }
        }

        reverse(list);
        Integer[] arrayInteger = list.toArray(new Integer[list.size()]);
        int[] ints = Ints.toArray(list);

        return ints;

    }

}
