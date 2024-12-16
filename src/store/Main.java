package store;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        
        Shoe s1 = new Shoe("Nike", 41, 30);
        Hat h1 = new Hat(3,"Gibbus Hat");


        gui.addProduct(s1);
        gui.addProduct(h1);
        gui.addProduct(new Shoe("Vans",39,40));

        gui.run();
    }
}
