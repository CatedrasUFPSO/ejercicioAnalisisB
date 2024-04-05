
package com.mycompany.freighttransport.vehicle;

import com.mycompany.freighttransport.packages.CantPackages;
import java.util.ArrayList;


public class Vehicle {
    private String vehicleType; //tipo de vehiculo
    //private CantPackages loadingCapacity;
    private int kmTours;
    private String plate;
    private Driver drive;
    private ArrayList<Vehicle> listVehicles;
    
    public Vehicle(String vehicleType, int kmTours,String plate, Driver drive) {
        this.vehicleType = vehicleType;
        this.kmTours = kmTours;
       // this.loadingCapacity= new CantPackages();
        this.plate=plate;
        this.drive=drive;
        this.listVehicles=new ArrayList();
    }

    
    
    public void registerVehicle(Vehicle vehicle){
        for(Vehicle car: listVehicles){
            car.registerVehicle(vehicle);
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleType=" + vehicleType + ", kmTours=" + kmTours + ", plate=" + plate + ", drive=" + drive + ", listVehicles=" + listVehicles + '}';
    }
    
    
}
