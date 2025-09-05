public class passingex {
    public static void main(String[] args) {
        String name = "tanmay singh";
        greet(name);
    }
    static void greet(String naam) {
        System.out.println(naam);
    }
}


// here string does not change because strings are immutable we can not modify the string even if we wnat to,
// and to change the name we must modify it, hence when we do the same operation for an array we can easily see the values change 
