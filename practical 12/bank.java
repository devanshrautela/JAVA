class Roi{
    void getRoi()
    {
      System.out.println("5.5%");
    }
}
class hdfc extends Roi
{
    void getRoi()
    {
      System.out.println("hdfc 4%");
    }
}
class pnb extends Roi
{
    void getRoi()
    {
      System.out.println("pnb 4.5%");
    }
}
class sbi extends Roi
{
    void getRoi()
    {
      System.out.println("sbi 5%");
    }
}
class bank
{
    public static void main(String[] args) {
        Roi r;
        r=new Roi();
        r.getRoi();
        r=new pnb();
        r.getRoi();
        r=new hdfc();
        r.getRoi();
        r=new sbi();
        r.getRoi();
    }
}


