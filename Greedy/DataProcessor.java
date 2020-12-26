/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ads7.Greedy;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author START
 */
public class DataProcessor {

    FigureOuter fig;

    DataProcessor(FigureOuter fig) {
        this.fig = fig;
    }

    public void assignator(ArrayList virtualResource, ArrayList physicalMachinesCost, ArrayList physicalMachinesResources) {
        Collections.sort(virtualResource);

        for (int i = virtualResource.size() - 1; i >= 0; i--) {
            var number = (int) virtualResource.get(i);
            System.out.println(fig.figureOut(physicalMachinesResources, physicalMachinesCost, number));
        }

    }

}
