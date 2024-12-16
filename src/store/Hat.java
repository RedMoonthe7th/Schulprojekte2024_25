package store;

public class Hat implements Product{
    private String name;
    private int price;

    public Hat(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
