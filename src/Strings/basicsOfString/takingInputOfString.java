package Strings.basicsOfString;

import java.util.Scanner;

public class takingInputOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter your name: ");

        String name = sc.nextLine();    // .nextLine take the whole sentence as string

        System.out.println(name);

    }
}
