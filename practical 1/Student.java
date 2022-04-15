class Student{
    int ID;
    String name;
    String Branch;
    String University;
    void setDetails(int r, String n, String br, String un)
    {
        name = n;
        ID = r;
        Branch = br;
        University = un;
    }
    void showDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+ID);
        System.out.println("Branch : "+Branch);
        System.out.println("University : "+University);
    }
    public static void main(String[] args)
    {
        Student Details = new Student();
        int r=Integer.parseInt(args[0]);
        String n=args[1];
        String br=args[2];
        String un=args[3];
        Details.setDetails(r,n,br,un);
        Details.showDetails();

    }
}