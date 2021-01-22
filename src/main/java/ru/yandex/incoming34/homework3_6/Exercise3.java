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
public class Exercise3 {

    public boolean checkArray(int[] array) {
        int qtyOnes = 0;
        int qtyFours = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1: {
                    qtyOnes++;
                    break;
                }
                case 4: {
                    qtyFours++;
                    break;
                }
                default: {
                    try {
                        throw new RedundantFigure();
                    } catch (RedundantFigure ex) {
                        System.out.println(ex);
                    }
                }

            }
        }

        return (qtyOnes == qtyFours);

    }

}
