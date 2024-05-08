package j32_Abstraction.shapeTask;

public interface Volume {

    public static final boolean hasVolume= true; // static & final by default

    public abstract double volume(); // public & abstract by default

   /*
    default void drink(){   // You can use "default" method to create method with implementation. Like static method.
         System.out.println("Drinks water");    // You can only use the method keyword "default" in interfaces.
     }
   */

}

