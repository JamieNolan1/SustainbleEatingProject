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
    public final int numberOfAnimals;
    
    

    public LivestockFarms(int id, String name, String location,String description, int numberOfAnimals) {
        super(id, name, location,description);
        this.numberOfAnimals = numberOfAnimals;
        
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNumber of Animals: " + numberOfAnimals;
    }
}
