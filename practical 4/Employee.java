public class Employee {
    int ID;
    String name;
    String department;
    int salary;
    Employee(int ID, String name, String department, int salary)
    {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void setDetails(int r, String na, String dp, int s)
    {
        name = na;
        ID = r;
        department = dp;
        salary = s;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no. : "+ID);
        System.out.println("Department : "+department);
        System.out.println("Salary : "+salary);
    }
    public static void main(String args[])
    {
        Employee xyz = new Employee(0, "", "", 0);
        int i = Integer.parseInt(args[0]);
        String na = args[1];
        String dp = args[2];
        int s = Integer.parseInt(args[3]);
        xyz.setDetails(i, na, dp, s);
        xyz.display();
    }
}
