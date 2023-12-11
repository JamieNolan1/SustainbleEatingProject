
package farmsapp;

/**
 * Base class
 */
public class FarmsApp {

    // Properties
    private final int id;
    private String name;
    private String location;
    private String description;

    // Constructor
    public FarmsApp(int farmID, String name, String location, String description) {
        this.id = farmID;
        this.name = name;
        this.location = location;
        this.description = description;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    // Setter method for location
    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    // Setter method for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Main method
    public static void main(String[] args) {
        // Your main method code here
    }

    // Farm search method
    public static void farmSearch() {
        // Your farmSearch method code here
    }
}


