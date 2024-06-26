package j30_FinalKeyword.animalTask;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        setName(name);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        setSize(size);
        setAge(age);
    }

    //----------Getters---------------------

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //----------Setters---------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //-----------------------------------------

    public void eat(){
        System.out.println(name+" is eating");
    }

    public final void drink(){
        System.out.println(name+" is drinking water");
    }




}