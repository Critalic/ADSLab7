/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ads7.Greedy;

import java.util.ArrayList;

/**
 *
 * @author START
 */
public class FigureOut implements FigureOuter {

    @Override
    public ArrayList figureOut(ArrayList physicalResource, ArrayList physicalCost, int virtRes) {

        ArrayList possibleFit = new ArrayList();
        ArrayList possibleFitIndex = new ArrayList();
        int finalIndex = 0;
        int finalNumber = 0;
        int finalCost = 0;
        for (int i = 0; i < physicalResource.size(); i++) {
            if (virtRes <= (int) physicalResource.get(i)) {
                possibleFit.add(physicalResource.get(i));
                possibleFitIndex.add(i);
            }
        }
        if (possibleFit.size() == 0) {
            return null;
        }

        var controller = (int) physicalCost.get((int) possibleFitIndex.get(0));

        for (int l = 0; l < possibleFitIndex.size(); l++) {
            int i = (int) possibleFitIndex.get(l);
            if (possibleFit.size() <= 1) {
                finalNumber = (int) possibleFit.get(l);
                finalIndex = (int) possibleFitIndex.get(l);
                finalCost = (int) physicalCost.get(finalIndex);
                break;
            } else {
                if (controller > (int) physicalCost.get(i)) {
                    controller = (int) physicalCost.get(i);
                    finalIndex = (int) possibleFitIndex.get(l);
                    finalNumber = (int) possibleFit.get(l);
                    finalCost = (int) physicalCost.get(finalIndex);
                }
                else if (controller == (int) physicalCost.get(i)) {
                    finalIndex = (int) possibleFitIndex.get(0);
                    finalNumber = (int) possibleFit.get(0);
                    finalCost = (int) physicalCost.get(finalIndex);
                }
                else {

                }
            }
        }

        physicalResource.set(finalIndex, ((int) physicalResource.get(finalIndex) - virtRes));
        physicalCost.set(finalIndex, 0);
        
        ArrayList answer = new ArrayList();
        answer.add(finalNumber);
        answer.add(finalCost);
        return answer;
    }
}
