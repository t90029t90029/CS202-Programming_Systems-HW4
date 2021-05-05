//Shang Chun, Lin  CS202 #assignment 4
//this is a file for the main

package com.company;
import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        list my_list;
        my_list = new list();

        Scanner input=null;
        int choose = 0;
        System.out.println("Hi, this is a food list program to record what you want to eat.");
        System.out.println("Now, please choose a service you would like to use. You have to enter a number.");
        System.out.println("1 for inserting an new food in the list,");
        System.out.println("2 for displaying the whole list,");
        System.out.println("3 for retrieving an item from the list,");
        System.out.println("4 for removing an item from the list,");
        System.out.println("5 for removing the whole list,");
        System.out.println("6 for quitting the program.");

        input = new Scanner(System.in);
        choose = input.nextInt();

        while(choose > 6 || choose < 1){
            System.out.println("The number is out of range.");
            input = new Scanner(System.in);
            choose = input.nextInt();
        }

        while(choose != 6) {
            if (choose == 1) {
                if(my_list.insert() != 0){
                    System.out.println("We have inserted it.");
                }
            }
            else if (choose == 2) {
                System.out.println("We have displayed " + my_list.display() + " items for you.");
            }
            else if (choose == 3) {
                System.out.println("Please enter a name of the food that you want to retrieve.");
                String a_name;
                input = new Scanner(System.in);
                a_name = input.nextLine();
                food to_found = null;
                if(my_list.retrieve(a_name,to_found) != 0){
                    System.out.println("We have found it.");
                    to_found.display();
                }
            }
            else if (choose == 4) {
                System.out.println("Please enter a name of the food that you want to remove.");
                String to_remove;
                input = new Scanner(System.in);
                to_remove = input.nextLine();

                if(my_list.remove(to_remove) != 0){
                    System.out.println("We have removed it.");
                }
            }
            else if (choose == 5) {
                my_list.remove_all();
                System.out.println("The list is clear now.");
            }

            System.out.println("Now, please choose a service you would like to use. You have to enter a number.");
            System.out.println("1 for inserting an new food in the list,");
            System.out.println("2 for displaying the whole list,");
            System.out.println("3 for retrieving an item from the list,");
            System.out.println("4 for removing an item from the list,");
            System.out.println("5 for removing the whole list,");
            System.out.println("6 for quitting the program.");

            input = new Scanner(System.in);
            choose = input.nextInt();

            while (choose > 6 || choose < 1) {
                System.out.println("The number is out of range.");
                input = new Scanner(System.in);
                choose = input.nextInt();
            }
        }
    }
}
