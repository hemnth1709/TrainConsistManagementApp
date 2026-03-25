import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Method to display bogie details
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 24));

        // Sort bogies based on capacity using Comparator
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Passenger Bogies Sorted by Capacity:");

        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println("Program continues...");
    }
}