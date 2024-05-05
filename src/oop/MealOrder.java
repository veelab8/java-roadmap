package oop;

public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
    }

    public MealOrder(Item side, Item drink, Burger burger) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public void addToppings() {}

    public void setDrinkSize() {}

    public void printItemizedList() {}

    public void printTotal() {}

    public Item getSide() {
        return side;
    }

    public void setSide(Item side) {
        this.side = side;
    }

    public Item getDrink() {
        return drink;
    }

    public void setDrink(Item drink) {
        this.drink = drink;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }
}
