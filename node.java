//Shang Chun, Lin  CS202 #assignment 4
//this is a file to implement a node class for DLL
package com.company;

public class node {
    protected food data;
    protected node next;
    protected node previous;

    public node go_next(){
        return this.next;
    }
    public void setnext(node source){
        this.next = source;
    }

    public node go_previous(){
        return this.previous;
    }
    public void setprevious(node source){
        this.previous = source;
    }

    public food get_data(){
        return this.data;
    }
    public void setdata(char answer){
        if(answer == 'B'){
            this.data = new boba();
        }
        else if(answer == 'P'){
            this.data = new pizza();
        }
        else {
            this.data = new steak();
        }
    }
}
