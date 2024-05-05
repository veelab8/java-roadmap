package oop;

public class Burger extends MealOrder {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(Item extra1, Item extra2, Item extra3) {
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public Burger(Item side, Item drink, Burger burger, Item extra1, Item extra2, Item extra3) {
        super(side, drink, burger);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public void addToppings() {}
}
