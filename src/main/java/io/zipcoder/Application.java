package io.zipcoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        PetOwner lena=new PetOwner("Lena");
        lena.add(cat1);
        cat1.setName("Chewy");
        System.out.println(lena.ownedPets());

    }
}

