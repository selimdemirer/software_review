package j04_PrimitiveTypeCastings;

public class Castings {

    public static void main(String[] args) {

        float averageScore=20.5F;

        byte num1 = (byte) averageScore; // we need explicit casting, because byte's range is smaller than float's
        short num2 = (short) averageScore; // we explicit need casting, because short's range is smaller than float's
        int num3 = (int) averageScore; // we need explicit casting, because int's range is smaller than float's
        //int num3 = (short) averageScore; // This might be also. Because int is larger than short
        long num4 = (long) averageScore; // we need explicit casting, because long's range is smaller than float's
        float num5 = averageScore; // there isn't any casting, already same
        double num6 = averageScore; // no need implicit casting, the smaller type being assigned to the larger automatically

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

    }
}
/*
create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */