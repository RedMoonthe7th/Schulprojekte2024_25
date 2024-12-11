package store;

public class Shoe implements Product{
    private int size;
    private int price;
    private String name;

    public Shoe(int size, int price, String name) {
        this.size = size;
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
