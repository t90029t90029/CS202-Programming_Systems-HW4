//Shang Chun, Lin  CS202 #assignment 4
//this is a file to implement an abstract class for the hierarchy
package com.company;
import java.util.Scanner;
import java.lang.String;

public abstract class food {
    protected String name;
    protected String size;
    protected Scanner input=null;

    public food(){
        name = null;
        size = null;
        input = new Scanner(System.in);
    }

    public food(final food source){
        if (source != null) {
            name = new String(source.name);
            size = new String(source.size);
        }
    }

    public abstract int insert();
    public abstract void display();
    public abstract int retrieve(String name_to_found,food to_found);

    public int compare(final String source){
        if(source != null){
            return this.name.compareToIgnoreCase(source);
        }
        return 1;
    }

    public int insert(int source){
        System.out.println("Please enter the name of the food.");
        name = input.nextLine();
        System.out.println("Please enter the size of the food.");
        size = input.nextLine();

        return 1;
    }
    public void display(int source){
        System.out.println("Food : " + name);
        System.out.println("Size : " + size);
    }
}
