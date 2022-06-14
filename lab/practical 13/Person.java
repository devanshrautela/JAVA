/*use super keyword
super keyword in Java is a refernce varaibale which 
is used to refer immediate parent class object*/
class detail {
    int id;
    String name;
    String city;
    detail(int id, String name, String city)
    {
        this.id = id;
        this.name = name;
        this.city = name;
    }
}
class Employee extends detail
{
    int salary;
    Employee(int id, String name, String city, int salary)
    {
        super(id, name, city);
        this.salary = salary;
    }
}
class Person{
    public static void main(String[] args)
    {
        Employee e = new Employee(2018314, "Devansh", "Khatima", 50000);
        System.out.printf("%nName : "+e.name+"%nID : "+e.id+"%nCity : "+e.city+"%nSalary : "+e.salary);
        //used printf to use %n to print newline
    }
}
