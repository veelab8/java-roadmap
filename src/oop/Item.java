package oop;

public class Item extends MealOrder {
    private String type;    // burger, drink, side or topping
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price, String size) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public Item(Item side, Item drink, Burger burger, String name, String type, double price, String size) {
        super(side, drink, burger);
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }


    public double getAdjustedPrice() {
        return 0.0;
    }

    public void printItem() {}
}
