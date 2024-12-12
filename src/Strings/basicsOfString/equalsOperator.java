package Strings.basicsOfString;

public class equalsOperator {

    public static void main(String[] args) {

        String s1 = "Harsh";

        String s2 = "Amit";

        String s3 = "Harsh";

        String s4 = new String("Harsh");

        System.out.println(s1 == s2);   // o/p: false

        System.out.println(s1 == s3); // o/p: true

        System.out.println(s3 == s4);   // o/p: false

        System.out.println(s3.equals(s4));  // o/p: true


    }
}
