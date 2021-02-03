/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.utils;

import hr.algebra.interfaces.Vehicle;
import hr.algebra.interfaces.Worker;
import java.util.List;

/**
 *
 * @author 38598
 */
public class FillWorker {
    
    public static void setWorkerPay(Worker worker,List<Vehicle> vehicles)
    {
        for(Vehicle v : vehicles)
        {
            double pay = v.getPrice()*(worker.getPayPrecentage()/100);
            worker.addPay(pay);
        }
    }
}
