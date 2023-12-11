/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmsapp;

/**
 *
 * @author jamie
 */
public class CropFarms extends FarmsApp {

    /**
     *
     */
    public String cropType = null;

    public CropFarms (int farmID, String name, String location, String description, String cropType) {
        super(farmID, name, location, description);
        this.cropType = cropType;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nCrop Type: " + cropType;
    }
}
