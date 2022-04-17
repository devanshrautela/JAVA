class bank{
  void getRoi()
  {
    System.out.println("5.5%");
  }
}
class hdfc extends bank
{
  void getRoi()
  {
    System.out.println("hdfc 4%");
  }
}
class pnb extends bank
{
  void getRoi()
  {
    System.out.println("pnb 4.5%");
  }
}
class sbi extends bank
{
  void getRoi()
  {
    System.out.println("sbi 5%");
  }
}
class call
{
  public static void main(String[] args) {
      bank b;
      b=new bank();
      b.getRoi();
      b=new pnb();
      b.getRoi();
      b=new hdfc();
      b.getRoi();
      b=new sbi();
      b.getRoi();
  }
}
