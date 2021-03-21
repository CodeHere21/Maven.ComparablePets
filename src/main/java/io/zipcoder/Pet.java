package io.zipcoder;

public abstract class Pet {
    String name;

    public Pet(){

    }

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name=name;
    }
    public String speak(){
        return "I can not speak yet";
    }
}
