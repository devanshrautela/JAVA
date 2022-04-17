class Person {
    int id;
    String name;
    String city;

    void getDetails(int id, String name, String city)
    {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    
    final void showDetails() //to block overridden
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("city : "+city);
    }
}
class employee extends Person{
    void showDetails()//shouldn't be able to overridden
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("city : "+city);
    }
    public static void main(String[] args)
    {
        employee e = new employee();
        e.getDetails(25, "Devansh", "Khatima");
        e.showDetails();
    }
}
