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
public class MainClass {
    
    
    public static void main(String[] args) {
        int[][] pyramid = {
            {7},
            {3,8},
            {8,1,0},
            {2, 7, 4, 4},
            {4, 5, 2, 6 ,5},    
        };
        
        int[][] pyramidS = {
            {7},
            {3,8},
            {8,1,0},
            {2, 7, 4, 4},
            {4, 5, 2, 6 ,5},    
        };
        int[][] pyramidB = {
            {7},
            {3,8},
            {8,1,0},
            {2, 7, 4, 4},
            {4, 5, 2, 6 ,5},    
        };
        
        System.out.println("Первинний масив: ");
        for (var i = 0; i <pyramid.length; i++) {
            for (var b = 0; b < pyramid[i].length; b++) {
                System.out.print( pyramid[i][b] + " ");
            }
            System.out.println(" ");
        }
    
        DataProcessor dp = new DataProcessor();
        System.out.print("Найменша сума чисел на маршруті: ");
        System.out.println(dp.calculatorSmall(pyramidS));
        System.out.println("Найменші суми у всіх вершинах: ");
        for (var i = 0; i <pyramidS.length; i++) {
            for (var b = 0; b < pyramidS[i].length; b++) {
                System.out.print( pyramidS[i][b] + " ");
            }
            System.out.println(" ");
        }
        
        
        System.out.print("Найбільша сума чисел на маршруті: ");
        System.out.println(dp.calculatorBig(pyramidB));
        System.out.println("Найбільші суми у всіх вершинах: ");
        for (var i = 0; i <pyramidB.length; i++) {
            for (var b = 0; b < pyramidB[i].length; b++) {
                System.out.print( pyramidB[i][b] + " ");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
