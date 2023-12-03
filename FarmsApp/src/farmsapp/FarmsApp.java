/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmsapp;

/**
 *
 * @author jamie
 */
import java.util.Scanner;

// Base class
class FarmsApp  {
    public int id;
    public String name;
    public String location;
    public String description;

    public FarmsApp (int id, String name, String location, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Farm ID: " + id + "\nName: " + name + "\nLocation: " + location + "\nDescription: " + description;
    }
}
