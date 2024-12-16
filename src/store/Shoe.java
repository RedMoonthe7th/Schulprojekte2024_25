package store;

public class Shoe implements Product{
    private String name;
    private int size;
    private int price;

    public Shoe(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
