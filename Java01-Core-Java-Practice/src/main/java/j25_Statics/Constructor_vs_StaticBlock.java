package j25_Statics;

public class Constructor_vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Constructor_vs_StaticBlock();
        System.out.println("Main Method");

    }

    {
        System.out.println("Instance Block");
    }

}
/*
   Execution Flow:
1-Static Blocks (only once)
2-Instance Blocks (whenever we create an object)
3-Constructors (whenever we create an object)
4-Main Method
 */