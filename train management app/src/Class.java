import java.util.ArrayList;
import java.util.List
public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display current state of the train
        if (trainConsist.isEmpty()) {
            System.out.println("No bogies attached to the train.");
        } else {
            System.out.println("Train Bogies:");
            for (int i = 0; i < trainConsist.size(); i++) {
                System.out.println((i + 1) + ". " + trainConsist.get(i));
            }
        }

        // Program continues
        System.out.println("\nApplication is ready...");
    }
}
