package CarExceptions;

public class GUI {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car c1 = new Car("red", e1);

        try {
            c1.startEngine();
        } catch (EngineException e) {
            System.out.println("Funktioniert nicht... lol " + e.getMessage());
        } catch (CarException e) {
            System.out.println("Funktioniert nicht... lol " + e.getMessage());
        }
    }
}
