package CarExceptions;

import java.util.Random;

public class Engine {
    public void start() throws EngineException {
        System.out.println("Engine Starts... Brumm Brumm");

        throw new EngineException("Engine doesn't work");
    }
}
