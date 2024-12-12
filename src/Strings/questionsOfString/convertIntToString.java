/*
💥 Take integer input and convert it into String
*/
package Strings.questionsOfString;

public class convertIntToString {

    public static void main(String[] args) {

        int num = 10;

        String str = "";

        str += num;

        System.out.println(str);

        System.out.println("The type of str is " + str.getClass().getName());   // The type of str is java.lang.String -- By using this we can check the class of any object

        System.out.println();

        if (str instanceof String) System.out.println("It's an String");
        else System.out.println("Not an String");

    }
}
