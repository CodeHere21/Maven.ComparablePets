package io.zipcoder;

public class Cat extends Pet {
    public Cat(){}

    public Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "meow!";
    }

    @Override
    public int compareTo(Pet o1) {
        return this.getName().compareTo(o1.getName());

    }

}
