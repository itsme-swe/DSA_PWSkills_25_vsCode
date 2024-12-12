package Strings.methodsOfString;

public class containsMethod {

    public static void main(String[] args) {

        String carName = "Roxx is 4*4 model";

        System.out.println(carName.contains(" 4*2"));   // o/p: false

        System.out.println(carName.startsWith("Ro"));   // o/p: true

        System.out.println(carName.endsWith("le")); // o/p: false
    }
}
