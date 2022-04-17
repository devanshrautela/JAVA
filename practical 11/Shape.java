public class Shape {
    int area(int a)
    {
        return a*a;
    }
    int area(int i, int b)
    {
        return i*b;
    }
    int area(float I, float b)
    {
        return (int)((I*b)/2);
    }
    int area(int r, double p)
    {
        return(int)(p*r*r);
    }
    public static void main(String[] args)
    {
        Shape d = new Shape();
        System.out.println("Area of square : "+d.area(10));
        System.out.println("Area of rectangle : "+d.area(10,5));
        System.out.println("Area of triangle : "+d.area(10f, 5f));
        System.out.println("Area of circle : "+d.area(10,3.14));
    }
}
