/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model.vehicle;

import hr.algebra.interfaces.Vehicle;

/**
 *
 * @author 38598
 */
public class Truck implements Vehicle {

    private final int truckPrice = 90;

    @Override
    public int getPrice() {
        return truckPrice;
    }

}
