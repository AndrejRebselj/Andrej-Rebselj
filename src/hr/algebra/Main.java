/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra;

import hr.algebra.interfaces.Train;
import hr.algebra.model.BigTrain;
import hr.algebra.model.SmallTrain;
import hr.algebra.model.vehicle.Bus;
import hr.algebra.model.vehicle.Car;
import hr.algebra.model.vehicle.Truck;
import hr.algebra.model.vehicle.Van;

/**
 *
 * @author 38598
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Train st = new SmallTrain();
        Train bt = new BigTrain();
        
        bt.addVehicle(new Bus());
        bt.addVehicle(new Truck());
        bt.addVehicle(new Bus());
        
        st.addVehicle(new Car());
        st.addVehicle(new Van());
        
        System.out.println("Ticket price of big train:" +bt.getTotalPrice());
        System.out.println("Ticket price of small train:" +st.getTotalPrice());
        
        
    }
    
}
