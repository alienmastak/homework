package com.company;

public interface ICoffeeMachine {
    void status(String number);
    void americano(String number);
    void espresso(String number);
    void doubleEspresso(String number);
    void fillWater(String number);
    void fillCoffee(String number);
    void information(String number);
    void turnOff(String number);
}



// в реализации интерфейса могут присутствовать только методы без тела и статические поля(свойства)
//ключевое слово abstract не пишется и операторы доступа не нужны
// создание методов внутри интерфейса не имеет смысла
// объект интерфейса нельзя создать динамически
