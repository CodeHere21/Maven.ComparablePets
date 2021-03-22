package io.zipcoder;
import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{
    String name;

    public Pet(){

    }

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String speak(){
        return "I can not speak yet";
    }

}
