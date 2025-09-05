import java.util.Scanner;

public class stringreturn {
    public static void main(String[] args) {
        //String message = greet();
        //System.out.println(message);


        Scanner in = new Scanner(System.in);
        System.out.println("enter your name lilbro");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised); 

    }

    static String myGreet(String name) {
        String message = "hello  " +      name;
        return message;

    }

    static String greet() {
        String greeting = "how are you lilnigga";
        return greeting;

    }


}
