/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model.vehicle;

import hr.algebra.interfaces.Vehicle;
import java.util.Random;

/**
 *
 * @author 38598
 */
public class Car implements Vehicle {

    private final int carPrice = 50;
    private static double fulePrecentage = 0;

    public Car() {
        Random r = new Random();
        fulePrecentage = r.nextDouble()*100;
    }

    
    @Override
    public int getPrice() {
        return carPrice;
    }

    @Override
    public double getFuelPrecentage() {
        return fulePrecentage;
    }

}
