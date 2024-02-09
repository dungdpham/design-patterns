package model;

import java.util.Random;

public class WeatherStation extends Observable implements Runnable {
    private int temperature;
    private final int MIN_TEMPERATURE = -10;
    private final int MAX_TEMPERATURE = 20;
    private final int TEMPERATURE_STEP = 1;
    private Random random;

    public WeatherStation() {
        random = new Random();
        temperature = random.nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1) + MIN_TEMPERATURE;
        printToConsole();

        notifyObservers();
    }

    public void printToConsole() {
        System.out.println("Weather station: " + temperature + " degree.");
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(4001) + 1000);

                if (random.nextBoolean()) {
                    temperature = Math.min(MAX_TEMPERATURE, temperature + TEMPERATURE_STEP);
                } else {
                    temperature = Math.max(MIN_TEMPERATURE, temperature - TEMPERATURE_STEP);
                }
                printToConsole();

                notifyObservers();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
