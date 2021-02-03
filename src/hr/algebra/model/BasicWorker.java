/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import hr.algebra.interfaces.Worker;

/**
 *
 * @author 38598
 */
public class BasicWorker implements Worker {

    private static double payPercentage = 10;
    private double currentPay = 0;

    public BasicWorker() {
    }
    
    public BasicWorker(double pay) {
        payPercentage = pay;
    }
    
    
    @Override
    public double getPayPrecentage() {
        return payPercentage;
    }

    @Override
    public double getCurrentPay() {
        return currentPay;
    }

    @Override
    public void addPay(double amount) {
        currentPay+=amount;
    }
    
}
