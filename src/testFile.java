public class testFile {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[1] = "To";
        str[2] = "To";
        str[3] = new String("To");
        str[4] = "To";

        System.out.println(System.identityHashCode(str[1]));
        System.out.println(System.identityHashCode(str[2]));
        System.out.println(System.identityHashCode(str[3]));
        System.out.println(System.identityHashCode(str[4]));

       if(str[1] == str[3]) System.out.println("true1");
       if(str[3].equals(str[4])) System.out.println("true2");
    }
}
