package j28_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    @Override
    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }

}

/*
1. Toyota:
					extra methods:
							reliable()
 */