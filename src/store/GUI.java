package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> procucts = new ArrayList<Product>();


    public void addProduct(Product product) {
        this.procucts.add(product);
    }
    public void run() {
        while(true) {
            System.out.println("1 Show Products");
            System.out.println("2 Show Stock Value");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    showStockValue();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    private void showProducts() {
        System.out.println("show Products");
        for (Product product : procucts) {
            System.out.println("Name: " + product.getName());
        }
    }
    private void showStockValue() {

    }
}
