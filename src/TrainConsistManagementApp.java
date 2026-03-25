import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet to store unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B101"); // Duplicate (will be ignored)
        bogieIDs.add("B102"); // Duplicate (will be ignored)

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        System.out.println("Duplicate IDs are automatically ignored.");
    }
}