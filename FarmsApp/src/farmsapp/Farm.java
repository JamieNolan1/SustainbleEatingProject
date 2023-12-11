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
        new CropFarms(1, "veggiefriends", "13 farmers road", "this farm opened in 1857, this Fram group has been growing locall and fresh carrpts for generations, a perfect choice for your favourite rabbit food ", "carrots"),
        new CropFarms(2, "stan and sons", "2 ashfield road", "this farm opened in 1965, Franks family has been growing the best cabbages around for many years, perfecting the trade.", "cabbages"),
        new CropFarms(3, "Irishpotatoes", "7 cropcircle avenue", "this farm opened in 1898, and has bunchs of fresh healthy potatoes or sweet potatoes, for amazing prices", "potatos"),
        new LivestockFarms(4, "oinkers", "4 planters road", "this farm opened in 1990, where the workers have been taking care of sheep to be able to produce sweaters as well as grass fed meat", 166),
        new LivestockFarms(5, "frank and sons farms", "1 ashfield road", "this farm opened in 1965, the cows from this farm are gven long, healthy lifes, and as a result the meat adn milk they produce is not only sustainable but well-sourced aswell ", 45),
        new LivestockFarms(6, "WholeMeats inc.", "22 farmers road", "this farm opened in 2018, and has always been committed tp providing the best local pig meat possible, and ensuring the happiness of the animals aswell", 137) };
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
  

