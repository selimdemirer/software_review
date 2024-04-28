package j28_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White"); // Dog used super class's constructor and didn't add its own fields

        System.out.println(dog1); // Dog didn't override and modify "toString" method

        dog1.bark();
        //dog1.scratch();
        //dog1.sing();

        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black"); // Cat used super class's constructor and didn't add its own fields

        System.out.println(cat1); // Cat didn't override and modify "toString" method
        cat1.scratch();
        //  cat1.bark();
        //  cat1.sing();

        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue", "Red"); // Parrot added its own fields to the super class's constructor

        System.out.println(parrot1); // Parrot overrode and modified "toString" method

        parrot1.eat();
        parrot1.drink();
        parrot1.move();
        parrot1.sleep();
        parrot1.sing();
        //  parrot1.bark();
        //  parrot1.scratch();

    }


}