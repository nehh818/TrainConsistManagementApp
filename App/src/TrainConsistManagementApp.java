// UC12 - Safety Compliance Check for Goods Bogies

import java.util.*;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies\n");

        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain"),
                new GoodsBogie("Cylindrical", "Coal") //

        );

        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(b -> System.out.println(b));

        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie -> {
                    if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                        return bogie.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });

        System.out.println("\nSafety Compliance Status: " + isSafe);
        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed ...");
    }
}