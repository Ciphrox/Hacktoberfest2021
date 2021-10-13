interface Shape{
    int a=4;
    double PI=3.14;
    void area();
}
class Circle implements Shape{
    public void area(){
        System.out.println("The area of circle is "+(PI*a*a));
    }
}
class Square implements Shape{
    public void area(){
        System.out.println("The area of square is "+(a*a));
    }
}

public class Interface {
    public static void main(String args[]){
        Circle c = new Circle();
        Square s = new Square();
        c.area();
        s.area();
    }
}
