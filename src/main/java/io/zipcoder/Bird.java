package io.zipcoder;

public class Bird extends Pet {
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "tweet!";
    }

    public int compareTo(Pet o1) {
        return this.getName().compareTo(o1.getName());
    }

}
