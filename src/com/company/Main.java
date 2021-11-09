package com.company;

import java.util.Scanner;

public class Main {

    public static int countChickenMethod() {
        System.out.println("How many chicken are there?");
        Scanner input = new Scanner(System.in);
        int chickens = input.nextInt();
        int chicken_legs = 2; //these are local because they are inside the scope of my method
        return chickens * chicken_legs;
    }
    public static int countCowsMethod() {
        System.out.println("How many cows are there?");
        Scanner input = new Scanner(System.in);
        int cows = input.nextInt();
        int cow_legs = 4;
        return cows * cow_legs;
    }
    public static int countPigsMethod() {
        System.out.println("How many pigs are there?");
        Scanner input = new Scanner(System.in);
        int pigs = input.nextInt();
        int pig_legs = 4;
        return  pigs * pig_legs;
    }







    public static void main(String[] args) {
        System.out.println(countChickenMethod());
        System.out.println(countCowsMethod());
        System.out.println(countPigsMethod());


    }




}
