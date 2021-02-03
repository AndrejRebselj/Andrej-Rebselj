/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra;

import hr.algebra.interfaces.Train;
import hr.algebra.interfaces.Worker;
import hr.algebra.model.BasicWorker;
import hr.algebra.model.BigTrain;
import hr.algebra.model.SmallTrain;
import hr.algebra.model.vehicle.Bus;
import hr.algebra.model.vehicle.Car;
import hr.algebra.model.vehicle.Truck;
import hr.algebra.model.vehicle.Van;
import hr.algebra.utils.FillWorker;
import hr.algebra.utils.FuelChecker;
import java.util.Random;

/**
 *
 * @author 38598
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Napunjeni vlakovi s vozilima i ispisane njihove cijene
        Train st = new SmallTrain();
        Train bt = new BigTrain();
        
        bt.addVehicle(new Bus());
        bt.addVehicle(new Truck());
        bt.addVehicle(new Bus());
        
        st.addVehicle(new Car());
        st.addVehicle(new Van());
        
        System.out.println("Ticket price of big train:" +bt.getTotalPrice()+" kn");
        System.out.println("Ticket price of small train:" +st.getTotalPrice()+" kn");
        
        //Stvaranje i prikaz prihod zaposlenika
        Worker worker = new BasicWorker();
        FillWorker.setWorkerPay(worker,bt.getVehicles());
        FillWorker.setWorkerPay(worker, st.getVehicles());
        
        System.out.println("Worker pay is: "+ worker.getCurrentPay()+" kn");
        
        //Provjera mora li se vozilo napuniti gorivom
        
        FuelChecker.checkForFuel(bt.getVehicles());
        FuelChecker.checkForFuel(st.getVehicles());
        
        //Dodavanje jos jednog zaposlenika s placom od 11%
        
        Worker worker2 = new BasicWorker(11);
        FillWorker.setWorkerPay(worker2,bt.getVehicles());
        FillWorker.setWorkerPay(worker2, st.getVehicles());
        
        System.out.println("Worker pay is: "+ worker2.getCurrentPay()+" kn");
    }
    
}
