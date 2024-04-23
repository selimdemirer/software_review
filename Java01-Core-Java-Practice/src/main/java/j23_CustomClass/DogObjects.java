package j23_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("---------------------1---------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> dogsList = new ArrayList<>();
        //dogsList.addAll(Arrays.asList(dogs));
        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);
        dogsList.add(dog4);
        dogsList.add(dog5);

        System.out.println("dogsList = " + dogsList);

        System.out.println("---------------------2---------------------");

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        for (Dog each : dogsList) {
            if (each.gender == 'F') {
                femaleDogs.add(each);
                System.out.println("femaleDogs = " + each.name);
            }
        }

        System.out.println("---------------------3---------------------");

        ArrayList<Dog> maleDogs = new ArrayList<>();
        for (Dog each : dogsList) {
            if (each.gender != 'F') {
                maleDogs.add(each);
                System.out.println("maleDogs = " + each.name);
            }
        }


    }


}