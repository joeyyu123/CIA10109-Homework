package hw5;

public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle myRectangle = new MyRectangle();
        myRectangle.setWidth(10);
        myRectangle.setDepth(20);
        System.out.println(myRectangle.getArea());


        MyRectangle myRectangle1 = new MyRectangle(10, 20);
        System.out.println(myRectangle1.getArea());
    }
}
