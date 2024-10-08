package _2_WorkingWIthAbstractionExercise._4_TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Light[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(light -> Light.valueOf(light))
                .toArray(Light[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            //Update the lights
            updateLights(lights);

            //Print the lights
            printLights(lights);
        }
    }

    private static void printLights(Light[] lights) {
        for (Light light : lights) {
            System.out.print(light + " ");
        }
        System.out.println();
    }

    private static void updateLights(Light[] lights) {
        for (int i = 0; i < lights.length; i++) {
            switch (lights[i]) {
                case RED -> lights[i] = Light.GREEN;
                case GREEN -> lights[i] = Light.YELLOW;
                case YELLOW -> lights[i] = Light.RED;
            }
        }
    }
}
