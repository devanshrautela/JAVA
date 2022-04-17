public class memory {
    int roll;
    String name;
    String branch;
    static String univ="gehu";
    void set(int r, String n, String b)
    {
        name = n;
        roll = r;
        branch = b;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no. : "+roll);
        System.out.println("Branch : "+branch);
        System.out.println("University : "+univ);
    }
    public static void main(String args[])
    {
        memory detail = new memory();
        detail.set(10,"Devansh","CSE");
        detail.display();
    }

}
