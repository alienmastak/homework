package com.company;

public class Philips extends CoffeeMachine implements ICoffeeMachine{

    int maxWaterQuantity=10;
    int maxCoffeeQuantity=10;
    int waterQuantity=10;
    int coffeeQuantity=10;
    Philips philips = new Philips();


    @Override
    public void status(String number) {
        System.out.println(nameCoffeeMachine);
        System.out.println("Остаток воды " +this.waterQuantity);
        System.out.println("Остаток кофе " +this.waterQuantity);
    }

    @Override
    public void americano(String number) {

    }

    @Override
    public void espresso(String number) {

    }

    @Override
    public void doubleEspresso(String number) {

    }

    @Override
    public void fillWater(String number) {

    }

    @Override
    public void fillCoffee(String number) {

    }

    @Override
    public void information(String number) {

    }

    @Override
    public void turnOff(String number) {

    }
}
