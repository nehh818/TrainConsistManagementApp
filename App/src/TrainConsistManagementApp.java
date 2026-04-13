// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private String type;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " -> " + capacity;
    }
}

// Main Class
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("UC14 - Handle Invalid Bogie Capacity\n");

        try {
            // Valid bogie creation
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + sleeper);

            // Invalid bogie creation (capacity = 0)
            PassengerBogie invalid = new PassengerBogie("AC Chair", 0);
            System.out.println("Created Bogie: " + invalid);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed ...");
    }
}