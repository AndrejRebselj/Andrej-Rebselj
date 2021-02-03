/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import hr.algebra.interfaces.Train;
import hr.algebra.interfaces.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 38598
 */
public class BigTrain implements Train {

    private static List<Vehicle> vehicles = new ArrayList();

    public BigTrain() {
    }

    
    @Override
    public int getTotalPrice() {
        int totalPrice = 0;

        for (Vehicle v : vehicles) {
            totalPrice += v.getPrice();
        }

        return totalPrice;
    }

    @Override
    public boolean checkSpace() {

        return (vehicles.size() < 6);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

}
