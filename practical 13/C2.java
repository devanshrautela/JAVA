package pack2;
import pack1.*;
public class C2 extends C1 implements I1{
    public  int divide(int a, int b){
        return a/b;
    }
}
class run{
    public static void main(String [] args){
        C2 C = new C2();
        System.out.println("Sum is "+C.sum(12,1));
        System.out.println("Sum is "+C.sub(12,1));
        System.out.println("Sum is "+C.divide(12,2));
    }
}
