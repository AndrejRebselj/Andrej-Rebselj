/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.utils;

import hr.algebra.interfaces.Vehicle;
import java.util.List;

/**
 *
 * @author 38598
 */
public class FuelChecker {
    
    public static void checkForFuel(List<Vehicle> vehicles)
    {
        for(Vehicle v : vehicles){
            if(v.getFuelPrecentage()<=10.00)
            {
                System.out.println("Vehicle "+v.getClass().getSimpleName()+" needs refuel at: "+v.getFuelPrecentage()+"%");
            }
            else
            {
                System.out.println("Vehicle "+v.getClass().getSimpleName()+" fuel level is: "+v.getFuelPrecentage()+"%");
            }
        }
    };
}
