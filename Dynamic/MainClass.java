
package com.mycompany.ads7.Dynamic;



public class MainClass {
    
    
    public static void main(String[] args) {
        int[][] pyramid = {
            {7},
            {3,8},
            {8,1,0},
            {2, 7, 4, 4},
            {4, 5, 2, 6 ,5},
            {5,10,20,8,3,0}
        };

        System.out.println("Первинний масив: ");
        for (var i = 0; i <pyramid.length; i++) {
            for (var b = 0; b < pyramid[i].length; b++) {
                System.out.print( pyramid[i][b] + " ");
            }
            System.out.println(" ");
        }
    
        DataProcessor dp = new DataProcessor();
        System.out.print("Найменша сума чисел на маршруті 7: ");
        System.out.println(dp.calculatorSmallMid(pyramid));

        System.out.print("Найбільша сума чисел на маршруті 7: ");
        System.out.println(dp.calculatorBigMid(pyramid)); 
        
        System.out.print("Найменша сума чисел на маршруті 4: ");
        System.out.println(dp.calculatorSmallLeft(pyramid));

        System.out.print("Найбільша сума чисел на маршруті 4: ");
        System.out.println(dp.calculatorBigLeft(pyramid)); 
        
        System.out.print("Найменша сума чисел на маршруті 5: ");
        System.out.println(dp.calculatorSmallRight(pyramid));

        System.out.print("Найбільша сума чисел на маршруті 5: ");
        System.out.println(dp.calculatorBigRight(pyramid)); 
        
    }
    
}
