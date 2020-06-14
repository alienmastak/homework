package com.company;

public class Bosch extends CoffeeMachine implements ICoffeeMachine{

    int maxWaterQuantity=8;
    int maxCoffeeQuantity=8;
    int waterQuantity=8;
    int coffeeQuantity=8;
    Bosch bosch = new Bosch();


    @Override
    public void status() {
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
