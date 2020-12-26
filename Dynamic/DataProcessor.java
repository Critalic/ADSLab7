
package com.mycompany.ads7.Dynamic;

import java.util.ArrayList;

public class DataProcessor {

    private int isBigger (ArrayList array, int b) {
        if ((int) array.get(b) <= (int)array.get(b+1)) {
            return (int) array.get(b+1);
        } else {
            return (int) array.get(b);
        }
    }

    private int isSmaller(ArrayList array, int b) {
        if ((int) array.get(b) <= (int)array.get(b+1)) {
            return (int) array.get(b);
        } else {
            return (int) array.get(b+1);
        }
    }

    
    // Big for mid
    int calculatorBigMid(int[][] array) {
        ArrayList <ArrayList<Integer>> sums = new ArrayList<>(array.length);
        for(int i =0; i<array.length; i++) {
            sums.add(new ArrayList());
            for(int b =0; b<array[i].length; b++) {
                sums.get(i).add(array[i][b]);
            }
        }
        
        for (var i = (sums.size() - 2); i >= 0; i--) {

            for (var b = 0; b < ( sums.get(i).size() ); b++) {
                int additive = isBigger(sums.get(i+1), b);
                sums.get(i).set(b,(sums.get(i).get(b) + additive) );
            }
        }
        
        return sums.get(0).get(0);

    }
    // Small for mid
    int calculatorSmallMid(int[][] array) {
        ArrayList <ArrayList<Integer>> sums = new ArrayList<>(array.length);
        for(int i =0; i<array.length; i++) {
            sums.add(new ArrayList());
            for(int b =0; b<array[i].length; b++) {
                sums.get(i).add(array[i][b]);
            }
        }
        
        for (var i = (sums.size() - 2); i >= 0; i--) {

            for (var b = 0; b < ( sums.get(i).size() ); b++) {
                int additive = isSmaller(sums.get(i+1), b);
                sums.get(i).set(b,(sums.get(i).get(b) + additive) );
            }
        }
        
        return sums.get(0).get(0);
    }
    
    
    // Small for left
    int calculatorSmallLeft(int[][] pyramid) {
        ArrayList <ArrayList<Integer>> sums = new ArrayList<>(pyramid.length);
        for(int i =0; i<pyramid.length; i++) {
            sums.add(new ArrayList());
            int b=i;
            while (b>=0) {
                sums.get(i).add(pyramid[((pyramid.length-1)-(b))][((pyramid[i].length-1 ) -b)]);
   
                b -=1;
                
            }
        }
        
        for (var i = (sums.size() - 2); i >= 0; i--) {

            for (var b = 0; b < ( sums.get(i).size() ); b++) {
                int additive = isSmaller(sums.get(i+1), b);
                sums.get(i).set(b,(sums.get(i).get(b) + additive) );
            }
        }
        
        return sums.get(0).get(0);
    }
    
    int calculatorBigLeft(int[][] pyramid) {
        ArrayList <ArrayList<Integer>> sums = new ArrayList<>(pyramid.length);
        for(int i =0; i<pyramid.length; i++) {
            sums.add(new ArrayList());
            int b=i;
            while (b>=0) {
                sums.get(i).add(pyramid[((pyramid.length-1)-(b))][((pyramid[i].length-1 ) -b)]);
   
                b -=1;
                
            }
        }
        
        for (var i = (sums.size() - 2); i >= 0; i--) {

            for (var b = 0; b < ( sums.get(i).size() ); b++) {
                int additive = isBigger(sums.get(i+1), b);
                sums.get(i).set(b,(sums.get(i).get(b) + additive) );
            }
        }
        
        return sums.get(0).get(0);

    }
    
    
    // Small for right
    int calculatorSmallRight(int[][] pyramid) {
        ArrayList <ArrayList<Integer>> sums = new ArrayList<>(pyramid.length);
        for(int i =0; i<pyramid.length; i++) {
            sums.add(new ArrayList());
            int b=i;
            while (b>=0) {
                sums.get(i).add(pyramid[(pyramid.length-1)-b][(pyramid.length-1)- (pyramid[i].length-1)]);
                
                b -=1;
                
            }
            
        }
        
        for (var i = (sums.size() - 2); i >= 0; i--) {

            for (var b = 0; b < ( sums.get(i).size() ); b++) {
                int additive = isSmaller(sums.get(i+1), b);
                sums.get(i).set(b,(sums.get(i).get(b) + additive) );
            }
        }
        
        return sums.get(0).get(0);
    }
    
    int calculatorBigRight(int[][] pyramid) {
        ArrayList <ArrayList<Integer>> sums = new ArrayList<>(pyramid.length);
        for(int i =0; i<pyramid.length; i++) {
            sums.add(new ArrayList());
            int b=i;
            while (b>=0) {
                sums.get(i).add(pyramid[(pyramid.length-1)-b][(pyramid.length-1)- (pyramid[i].length-1)]);
                
                b -=1;
                
            }
            
        }
        
        for (var i = (sums.size() - 2); i >= 0; i--) {

            for (var b = 0; b < ( sums.get(i).size() ); b++) {
                int additive = isBigger(sums.get(i+1), b);
                sums.get(i).set(b,(sums.get(i).get(b) + additive) );
            }
        }
        
        return sums.get(0).get(0);
    }
    

}
