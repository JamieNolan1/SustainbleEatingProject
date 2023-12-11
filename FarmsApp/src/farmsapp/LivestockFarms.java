/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmsapp;

/**
 *
 * @author jamie
 */
public class LivestockFarms extends FarmsApp {

    /**
     *
     */
    public int numberOfAnimals;
    
    

    

    public LivestockFarms(int farmID, String name, String location, String description, int numberOfAnimals) {
        super(farmID, name, location,description);
        this.numberOfAnimals = numberOfAnimals;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNumber of Animals: " + numberOfAnimals;
    }
}
