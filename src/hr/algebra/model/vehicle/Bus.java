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
public class Bus implements Vehicle {

    private final int busPrice = 70;

    @Override
    public int getPrice() {

        return busPrice;
    }

}
