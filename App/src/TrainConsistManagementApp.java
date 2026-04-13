import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)\n");

        // Prepare dataset of bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Passenger-" + i, (i % 100) + 50)); // capacity between 50–149
        }

        // Loop-based filtering
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // Stream-based filtering
        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Print results
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // Verify consistency
        System.out.println("\nLoop result size: " + loopFiltered.size());
        System.out.println("Stream result size: " + streamFiltered.size());

        if (loopFiltered.size() == streamFiltered.size()) {
            System.out.println(" Results match between loop and stream filtering.");
        } else {
            System.out.println(" Results differ between approaches.");
        }

        System.out.println("\nUC13 performance benchmarking completed ...");
    }
}