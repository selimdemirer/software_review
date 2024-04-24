package j24_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.5, 3.5);

        Rectangle rectangle2 = new Rectangle(10.5, 8.5);

        System.out.println(rectangle1);
        System.out.println(rectangle1.calcPerimeter());
        System.out.println(rectangle1.calcArea());
        
        System.out.println(rectangle2);
        System.out.println(rectangle2.calcPerimeter());
        System.out.println(rectangle2.calcArea());


    }


}
