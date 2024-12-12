package Strings.methodsOfString;

public class valueOfMethod {

    public static void main(String[] args) {

        int num = 101;

        String val = String.valueOf(num);

        System.out.println(val);

        System.out.println("The type of num is " + ((Object)val).getClass().getName());
    }
}

// o/p: The type of num is java.lang.String