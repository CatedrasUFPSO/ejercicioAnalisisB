//Karen Marcela Bayona 
// Código= 192215
package com.mycompany.freighttransport;

import com.mycompany.freighttransport.vehicle.Driver;
import com.mycompany.freighttransport.vehicle.Vehicle;

public class FreightTransport {

    public static void main(String[] args) {
        //Conductor
        Driver drive1= new Driver("Manuel","137664327",47);
        Driver drive2= new Driver("Daniel","137664787",20);
        Driver drive3= new Driver();
        
        
        //Registrar vehiculo
        Vehicle vehicle1= new Vehicle("Camioneta", 3000,"KJ123",drive1);
        Vehicle vehicle2= new Vehicle("Carro", 3500,"KJT23",drive2);
        Vehicle vehicle3= new Vehicle("Camión", 4000,"KJK23",drive3);
        
        vehicle1.registerVehicle(vehicle1);
        
    }
}
