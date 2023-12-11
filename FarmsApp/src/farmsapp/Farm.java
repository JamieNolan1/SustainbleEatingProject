/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmsapp;

/**
 *
 * @author jamie
 */
import java.util.Scanner;
public class Farm {

    /**
     *
     */
    public static Farm[] farmGroups;

   
    
    
   
    
    public static void initializeFarms() {
        farmGroups = new Farm[]{
        new CropFarms(1, "name", "location", "description", "carrots"),
        new CropFarms(2, "name", "location", "description", "carrots"),
        new CropFarms(3, "name", "location", "description", "carrots"),
        new LivestockFarms(4, "name", "location", "description", 100),
        new LivestockFarms(5, "name", "location", "description", 100),
        new LivestockFarms(6, "name", "location", "description", 100) };
  }
    
  public static void searchFarmById(){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter Farm ID to search: ");
      int searchId = scanner.nextInt();
      
      Farm foundFarm = null;
        Iterable<Farm> farmGroups = null;
      
      for(Farm farm : farmGroups = null){
          if (farm.getfarmID() == searchId) {
              foundFarm = farm;
              break;
          }
      }
      if ( foundFarm != null) {
          System.out.println("Farm found:\n" + foundFarm);
      } else{
          System.out.println("Farm not found with Id: " + searchId);
          }
      }
  
   public static Farm[] getFarmGroups() {
        return farmGroups;
    }

    public static void setFarmGroups(Farm[] farmGroups) {
        Farm.farmGroups = farmGroups;
    }

    private int getfarmID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
   
    }
  

