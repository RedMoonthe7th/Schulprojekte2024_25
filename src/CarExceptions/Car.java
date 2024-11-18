package CarExceptions;

import java.util.Random;

public class Car {
    private String color;
    private Engine engine;

    public Car(String color, Engine engine) {
        this.engine = engine;
        this.color = color;
    }
    public void startEngine() throws EngineException, CarException {
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new CarException("Car Problem");
        }
        engine.start();
    }
}
