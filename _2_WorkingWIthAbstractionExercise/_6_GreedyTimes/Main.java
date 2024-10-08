
package _2_WorkingWIthAbstractionExercise._6_GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long input = Long.parseLong(scanner.nextLine());
        String[] vault = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();

        for (int i = 0; i < vault.length; i += 2) {
            String name = vault[i];
            long counter = Long.parseLong(vault[i + 1]);

            String value = "";

            if (name.length() == 3) {
                value = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                value = "Gem";
            } else if (name.equalsIgnoreCase("gold")) {
                value = "Gold";
            }

            if (value.isEmpty()) {
                continue;
            } else if (input < bag.values().stream()
                    .map(Map::values).flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + counter) {
                continue;
            }

            if (safeContentVerification(value, bag, counter)) continue;

            if (!bag.containsKey(value)) {
                bag.put((value), new LinkedHashMap<>());
            }

            if (!bag.get(value).containsKey(name)) {
                bag.get(value).put(name, 0L);
            }

            bag.get(value).put(name, bag.get(value).get(name) + counter);
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", x.getKey(), sumValues);

            x.getValue().entrySet()
                    .stream().sorted((e1, e2) -> e2.getKey()
                            .compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean safeContentVerification(String value, LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long counter) {
        switch (value) {
            case "Gem":
                if (!bag.containsKey(value)) {
                    if (bag.containsKey("Gold")) {
                        if (counter > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (bag.get(value).values().stream().mapToLong(e -> e).sum() + counter > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
                break;
            case "Cash":
                if (!bag.containsKey(value)) {
                    if (bag.containsKey("Gem")) {
                        if (counter > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (bag.get(value).values().stream().mapToLong(e -> e).sum() + counter > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
                break;
        }
        return false;
    }
}