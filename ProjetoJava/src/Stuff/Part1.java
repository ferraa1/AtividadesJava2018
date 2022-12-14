package Stuff;

import java.util.Scanner;

public class Part1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("You arrive with your car in your parent's winter cabin.");
        System.out.println("");
        System.out.println("You stop the car and turn it off, you reach for the glove compartment.");
        System.out.println("Inside, you take a key and a note your father gave you.");
        System.out.println("");
        System.out.println("You read the note: Son, remember to turn the generator on before entering the cabin,");
        System.out.println("the key I gave you is to open the shack in the back, there you will find the generator and the key to the house.");
        System.out.println("");
        System.out.println("To play the game do the following: type a verb (look, go, enter, grab...) and then something (tree, cabin, car, toy...).");
        System.out.println("Remember key words such as cabin, shack, car...");
        System.out.println("If you don't know what to do try looking around.");
        System.out.println("");
        int choice = 0;
        while (choice == 0) {
            System.out.print("What do you do? ");
            String action = sc.next();
            String object = sc.next();
            if (action.equalsIgnoreCase("look")) {
                if (object.equalsIgnoreCase("around")) {
                    System.out.println("There is nothing interesting around, you just have to leave the car.");
                } else {
                    System.out.println("???");
                }
            } else if (action.equalsIgnoreCase("leave")) {
                if (object.equalsIgnoreCase("car")) {
                    System.out.println("");
                    System.out.println("You open the car door and leave.");
                    System.out.println("You are outside the car, it's really cold.");
                    choice = 1;
                } else {
                    System.out.println("???");
                }
            } else {
                System.out.println("???");
            }
        }
        choice = 0;
        while (choice == 0) {
            System.out.print("What do you do? ");
            String action = sc.next();
            String object = sc.next();
            if (action.equalsIgnoreCase("enter") && object.equalsIgnoreCase("case")) {
                System.out.println("You don't need to go inside the car again.");
            } else if (action.equalsIgnoreCase("look")) {
                if (object.equalsIgnoreCase("around")) {
                    System.out.println("You look around and you see your car, your parent's cabin and the shack with the generator.");
                } else if (object.equalsIgnoreCase("car")) {
                    System.out.println("You look at your car, there's nothing special about it.");
                } else if (object.equalsIgnoreCase("cabin")) {
                    System.out.println("You look at your parent's winter cabin, a lot of good old childhood memories come to your mind.");
                    System.out.println("You remember it's locked and the key is in the shack.");
                } else if (object.equalsIgnoreCase("shack")) {
                    System.out.println("You look at the shack in the back, that's where you need to go.");
                } else {
                    System.out.println("???");
                }
            } else if (action.equalsIgnoreCase("enter") || action.equalsIgnoreCase("go")) {
                if (object.equalsIgnoreCase("cabin")) {
                    System.out.println("You try to enter the cabin but the door is locked.");
                } else if (object.equalsIgnoreCase("shack")) {
                    System.out.println("You go to the shack, unlock the door and enter.");
                    choice = 1;
                }
            } else {
                System.out.println("???");
            }
        }
    }
}