public class Example2 {
    public static void main(String[] args){
        System.out.println(empId.matches("[a-zA-Z0-9_]+"));
        System.out.println(empId.matches("\\w+"));
        System.out.println("ram kumar".matches("[a-z]+\\s[a-z]+"));
        System.out.println("ram kumar".matches("\\w+\\s+\\w+"));
        System.out.println("ram kumar".matches("\\w+\\s+\\w+\\w+"));
        System.out.println(empId.matches("ram.*"));
        System.out.println(empId.matches(".*CTS$"));
        System.out.println("hello123hello".matches("^.*(123).*$"));
        System.out.println("hello123hello".matches("^.*\\d+.*$"));


    }
}
