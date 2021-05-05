//Shang Chun, Lin  CS202 #assignment 4
//this is a file to implement a derived class for the hierarchy
package com.company;
import java.util.Scanner;
import java.lang.String;

public class boba extends food{
    protected String tea;
    protected String jelly;
    protected Scanner input=null;

    public boba(){
        tea = null;
        jelly = null;
        input = new Scanner(System.in);
    }
    public boba(final boba source){
        if (source != null) {
            tea = new String(source.tea);
            jelly = new String(source.jelly);
        }
    }

    public int insert(){
        if(super.insert(1) == 1) {
            System.out.println("Please enter what kind of tea.");
            tea = input.nextLine();
            System.out.println("Please enter what kind of jelly.");
            jelly = input.nextLine();
        }
        return 1;
    }
    public void display(){
        super.display(1);
        System.out.println("Tea : " + tea);
        System.out.println("Jelly : " + jelly);
        System.out.println();
        return;
    }
    public int retrieve(String name_to_found,food to_found){
        if(this == null){
            return 0;
        }
        if(super.compare(name_to_found) == 0) {
            to_found = new boba(this);
        }
        return 1;
    }

}
