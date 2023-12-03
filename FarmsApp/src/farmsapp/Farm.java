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
    public static Farm[] farms;
    
   
    
    public static void initializeFarms() {
        farms = new Farm[]{
        new CropFarms(1, "name", "location", "description", "carrots"),
        new CropFarms(2, "name", "location", "description", "carrots"),
        new CropFarms(3, "name", "location", "description", "carrots"),
        new LivestockFarm(4, "name", "location", "description", 100),
        new LivestockFarm(5, "name", "location", "description", 100),
        new LivestockFarm(6, "name", "location", "description", 100)    
    };
  }
    
  public static void searchFarmById(){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter Farm ID to search: ");
      int searchId = scanner.nextInt();
      
      Farm foundFarm = null;
      
      for(Farm farm : farms){
          if (farm.getId() == searchId) {
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

    private int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class LivestockFarm extends Farm {

        public LivestockFarm(int i, String name, String location, String description, int i0) {
        }
    
    }
  }

