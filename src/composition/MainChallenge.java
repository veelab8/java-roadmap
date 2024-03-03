package composition;

public class MainChallenge {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkTodo(true);
//        kitchen.getIceBox().setHasWorkTodo(true);
//        kitchen.getBrewMaster().setHasWorkTodo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        // call one method in Kitchen to set some of the appliance's readiness state
        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
