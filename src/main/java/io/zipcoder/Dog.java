package io.zipcoder;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "bark!";
    }
    @Override
    public int compareTo(Pet o1) {
        return this.getName().compareTo(o1.getName());
    }


}
