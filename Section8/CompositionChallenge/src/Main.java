public class Main {

    public static void main(String[] args) {

        Refrigerator iceBox = new Refrigerator();
        CoffeeMaker brewMaster = new CoffeeMaker();
        DishWasher dishWasher = new DishWasher();

        SmartKitchen sk = new SmartKitchen(iceBox, dishWasher, brewMaster);
        sk.addWater();
        sk.loadDishwasher();

        sk.doKitchenWork();
    }
}
