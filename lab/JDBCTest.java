Class JDBCTest {
    public static void main(String args[]){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Sucess");
        } catch (Exception e) {
            System.out.prtinln(e);
        }
    }
}
