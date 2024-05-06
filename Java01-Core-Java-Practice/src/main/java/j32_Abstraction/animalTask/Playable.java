package j32_Abstraction.animalTask;

public interface Playable { //super type

    static final boolean isFriendly = true; // static & final by default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    public abstract void play(); // public & abstract by default


}