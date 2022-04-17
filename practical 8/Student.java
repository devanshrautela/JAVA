public class Student {
    int roll;
    String name;
    String branch;
    String city;
    String univ;
    Student(int roll)
    {
        this.roll = roll;
    }
    Student(int roll, String name)
    {
        this(roll);
        this.roll = roll;
        this.name = name;
    }
    Student(int roll, String name, String branch)
    {
        this(roll,name);
        this.roll = roll;
        this.name = name;
        this.branch = branch;
    }
    Student(int roll, String name, String branch, String city)
    {
        this(roll, name, branch);
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.city = city;
    }
    Student(int roll, String name, String branch, String city,String univ)
    {
        this(roll, name, branch, city);
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.city = city;
        this.univ = univ;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Rollno. : "+roll);
        System.out.println("Branch : "+branch);
        System.out.println("City : "+city);
        System.out.println("University : "+univ);
    }
    public static void main(String[] args)
    {
        Student detail = new Student(20, "Devansh", "CSE","Dehradun","GEHU");
        detail.display();
    }
}
