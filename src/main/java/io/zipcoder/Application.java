package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;


public class Application {

    private static ArrayList<Pet> pets;

    public static void main(String[] args) {
        Integer numOfPets = getInteger("How many pets do you have?");
        ArrayList<Pet> pet = new ArrayList<Pet>();
        pets = pet;


        for(int i = 0; i < numOfPets; i++) {
            String species = getStringInput("What kind of pet?");
            String name = getStringInput("What is their name?");
            if(species.equals("cat")) {
                pets.add(new Cat(name));
            }
            else if(species.equals("dog")) {
                pets.add(new Dog(name));
            }
            else if(species.equals("guineapig")){
                pets.add(new GuineaPig(name));
            }
            else{
                pets.add(new Fish(name));
            }
        }


        printPets();

    }
    public static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getInteger(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }
    public static void printPets(){
        for(Pet p : pets) {
            System.out.println(p.getName()+ " "+ p.speak());
        }
    }
}
