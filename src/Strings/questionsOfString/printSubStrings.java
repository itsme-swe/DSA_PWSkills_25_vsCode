/*
💥 Print all the substring of the strings.
*/

package Strings.questionsOfString;

public class printSubStrings {

    public static void main(String[] args) {

        String tech = "Golang";

        for (int i = 0; i < tech.length(); i++) {
            for (int j = i + 1; j <= tech.length(); j++) {
                System.out.print(tech.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}

/*

G Go Gol Gola Golan Golang
o ol ola olan olang
l la lan lang
a an ang
n ng
g

*/
