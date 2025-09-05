public class swap {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        //to swap numbers code bro 
        int temp =a;
        a=b;
        b=temp;
        swap(a, b);
        System.out.println(a + "  "+ b);

        //to swap names in strings

        
        String name = "tanmay singh";
        changename(name);
        System.out.println(name);
    }

    static void changename(String name) {
        name ="Tonmoi Singu";


    }



    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        
    }
}

