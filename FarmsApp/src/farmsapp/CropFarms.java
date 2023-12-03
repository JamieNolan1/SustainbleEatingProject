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
    public final String cropType;

    public CropFarms(int id, String name, String location, String description, String cropType) {
        super(id, name, location, description);
        this.cropType = cropType;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "\nCrop Type: " + cropType;
    }
}
