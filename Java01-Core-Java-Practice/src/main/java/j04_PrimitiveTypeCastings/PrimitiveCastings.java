package j04_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;

        short b = a; // implicit casting
        // short b = (short)a; --> That is what compiler does in the background

        int c = b; // implicit casting
        // int c = (int)b; --> That is what compiler does in the background

        long d = c;
        // long d = (long)c; --> That is what compiler does in the background

        float e = d; // implicit casting

        double f = e; // implicit casting

        //----------------------------------------

        int x = 55;
        short y = (short)x; // explicit casting

        System.out.println(x + " : " + y);

        long j = 100000;
        short k = (short)j;

        System.out.println(j + " : " + k);

        double n = 10.8;
        int m = (int) (long) n; // we can do multiple castings
        //int m = (int) n;

        System.out.println(n + " : " + m);

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + " : " + s1);
        
        int aa = 'A';
        System.out.println("aa = " + aa);

    }

}
