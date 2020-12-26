/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ads7.Dynamic;

/**
 *
 * @author START
 */
public class DataProcessor {

    private int isBigger(int[][] array, int i, int b) {
        if (array[i][b] >= array[i][b + 1]) {
            return array[i][b];
        } else {
            return array[i][b + 1];
        }
    }

    private int isSmaller(int[][] array, int i, int b) {
        if (array[i][b] <= array[i][b + 1]) {
            return array[i][b];
        } else {
            return array[i][b + 1];
        }
    }

    
    
    int calculatorBig(int[][] array) {

        for (var i = (array.length - 2); i >= 0; i--) {

            for (var b = 0; b < array[i].length; b++) {
                int additive = isBigger(array, i + 1, b);
                array[i][b] = array[i][b] + additive;
            }
        }
        return array[0][0];

    }

    int calculatorSmall(int[][] array) {

        for (var i = (array.length - 2); i >= 0; i--) {

            for (var b = 0; b < array[i].length; b++) {
                int additive = isSmaller(array, i + 1, b);
                array[i][b] = array[i][b] + additive;
            }
        }
        return array[0][0];
    }

}
