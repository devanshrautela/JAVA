public class handlers {
    public static void main(String [] args)
    {
        String s = "java";
        System.out.println(s.concat(" WELCOME")); //doesn't changes original string
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a',s.indexOf('a')+1));
        System.out.println(s.equals("JAVA"));
        System.out.println(s.equalsIgnoreCase("JAVA"));
        System.out.println(s.lastIndexOf('a'));
    }
}
