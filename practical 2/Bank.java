public class Bank {
    int account_no;
    String name;
    int amount;
    void insert(int account_no, String name, int amount)
    {
        this.account_no = account_no;
        this.name = name;
        this.amount = amount;
    }
    void deposit(int amount)
    {
        this.amount += amount;
    }
    void withdraw(int amount)
    {
        if(this.amount >= amount)
        {
            System.out.println("Money withdrawn : "+amount);
            this.amount -= amount;
            System.out.println("Amount remaining :"+this.amount);
        }
        else{
            System.out.println("Low Balance");
        }
    }
    void display()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Account Number : "+this.account_no);
        System.out.println("Account Balance : "+this.amount);
    }
    public static void main(String args[])
    {
        Bank obj = new Bank();
        obj.insert(20000,"Devansh Rautela",100000);
        obj.display();
        obj.withdraw(200000);
        obj.display();
        obj.deposit(15000);
        obj.display();
    }
}
