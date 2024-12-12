package Strings.stringBuffer.methodsOfStringBufferClass;

public class capacityMethod {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();

        System.out.println(str.capacity()); // initial capacity is 16

        StringBuffer str1 = new StringBuffer("Harsh");

        System.out.println(str1.capacity());    // now the capacity will 21 bcoz (initial capacity + value)
    }
}
