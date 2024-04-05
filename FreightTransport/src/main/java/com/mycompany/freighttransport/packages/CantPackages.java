
package com.mycompany.freighttransport.packages;

import java.util.ArrayList;


public class CantPackages {
    private int cantOfPackages;
    private String idPackage;
    private ArrayList<CantPackages> listPackages;
    public CantPackages(int cantOfPackages,String idPackage) {
        this.cantOfPackages = cantOfPackages;
        this.idPackage=idPackage;
        this.listPackages = new ArrayList<>();
    }
    
    public int getCantOfPackages() {
        return cantOfPackages;
    }

    public String getIdPackage() {
        return idPackage;
    }
    
    
    public ArrayList<CantPackages> getListPackages() {
        return listPackages;
    }
    
    
    
    public void addPackage(int packagee){
        for(CantPackages cant :   listPackages){
            if(packagee <= cant.getCantOfPackages() ){
                cant.addPackage(packagee);
            }
        }
        System.out.println("Se excede del limite de paquetes permitidos");
    }
//    public void removePackage(String searchId){
//        for(CantPackages search : listPackages){
//            if(searchId.equalsIgnoreCase()){
//                
//            }
//        }
//    }

    
}
