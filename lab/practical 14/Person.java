final public class Person {
    int id;
    String name;
    String city;
    void getDetails(int id, String name, String city)
    {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    void showDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("city : "+city);
    }
}
class employee extends Person{
    public static void main(String[] args)
    {
        employee e = new employee();
        e.getDetails(25, "Devansh", "Khatima");
        e.showDetails();
    }
}
