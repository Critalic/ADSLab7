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
public class MainClass {

    static ArrayList virtualMachinesResources = new ArrayList();
    static ArrayList physicalMachinesCost = new ArrayList();
    static ArrayList physicalMachinesResources = new ArrayList();

    public void setVirtualMachinesResources(ArrayList virtualMachinesResources) {
        virtualMachinesResources.add(1);
        virtualMachinesResources.add(6);
        virtualMachinesResources.add(3);
        virtualMachinesResources.add(2);
        virtualMachinesResources.add(10);
        virtualMachinesResources.add(2);
        virtualMachinesResources.add(5);
        virtualMachinesResources.add(3);
        virtualMachinesResources.add(1);
        virtualMachinesResources.add(1);

    }

    public void setPhysicalMachinesCost(ArrayList physicalMachinesCost) {
        physicalMachinesCost.add(700);
        physicalMachinesCost.add(2800);
        physicalMachinesCost.add(1300);
        physicalMachinesCost.add(850);
        physicalMachinesCost.add(650);
        physicalMachinesCost.add(420);
        physicalMachinesCost.add(1000);
    }

    public void setPhysicalMachinesResources(ArrayList physicalMachinesResources) {
        physicalMachinesResources.add(2);
        physicalMachinesResources.add(7);
        physicalMachinesResources.add(5);
        physicalMachinesResources.add(3);
        physicalMachinesResources.add(2);
        physicalMachinesResources.add(1);
        physicalMachinesResources.add(4);
    }

    public static void main(String[] args) {
        MainClass m = new MainClass();
        DataProcessor dat = new DataProcessor(new FigureOut());

        m.setPhysicalMachinesCost(physicalMachinesCost);
        m.setPhysicalMachinesResources(physicalMachinesResources);
        m.setVirtualMachinesResources(virtualMachinesResources);

        dat.assignator(virtualMachinesResources, physicalMachinesCost, physicalMachinesResources);

    }

}
