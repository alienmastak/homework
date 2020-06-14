package com.company;

import java.util.Scanner;

public class Main {

    private static String nameCoffeeMachine;

    public static void main(String[] args) {
	// write your code here
        //String nameCoffeeMachine = new String();
        startMenu();
        workMenu();

    }

    public static void workMenu(){
        int count=0;
        Scanner sc = new Scanner(System.in);
        int choice=0;
        while (choice!=8){
            count++;
            System.out.println();
            System.out.println("1. Show the status");
            System.out.println("2. Americano");
            System.out.println("3. Espresso");
            System.out.println("4. Double Espresso");
            System.out.println("6. Fill the water tank");
            System.out.println("7. fill the coffee tank");
            System.out.println("8. Quit");
            System.out.println("Your choise:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    status();
                    break;
                case 2:
                    System.out.println(count);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("что-то пошло не так");
            }
        }

    }

    public static void startMenu(){
        Scanner sc = new Scanner(System.in);
        int choice=0;
        while (choice!=3){
            System.out.println("Welcome");
            System.out.println("select coffee machine model");
            System.out.println("1. Bosch");
            System.out.println("2. Philips");
            System.out.println("3. Quit");
            System.out.println("Your choiсe:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You chose Bosch");
                    Bosch coffeeMachine = new Bosch();
                    nameCoffeeMachine="Bosch";
                    choice=3;
                    break;
                case 2:
                    System.out.println("You chose Philips");
                    nameCoffeeMachine="Philips";
                    choice=3;

                    break;
                case 3:
                    break;
                default:
                    System.out.println("что-то пошло не так");
                    break;
            }
        }

    }
}
