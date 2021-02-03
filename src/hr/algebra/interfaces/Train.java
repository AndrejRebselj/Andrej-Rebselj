/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.interfaces;

import java.util.List;

/**
 *
 * @author 38598
 */
public interface Train {
    public int getTotalPrice();
    public boolean checkSpace();
    public void addVehicle(Vehicle vehicle);
    public List<Vehicle> getVehicles();
}
