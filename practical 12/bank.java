class bank{
    void getroi()
    {
      System.out.println("5.5%");
    }
}
class hdfc extends bank
{
    void getroi()
    {
      System.out.println("hdfc 4%");
    }
}
class pnb extends bank
{
    void getroi()
    {
      System.out.println("pnb 4.5%");
    }
}
class sbi extends bank
{
    void getroi()
    {
      System.out.println("sbi 5%");
    }
}
class call
{
    public static void main(String[] args) {
        bank b;
        b=new bank();
        b.getroi();
        b=new pnb();
        b.getroi();
        b=new hdfc();
        b.getroi();
        b=new sbi();
        b.getroi();
    }
}


