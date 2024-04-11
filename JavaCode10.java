/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode10.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode10
*/

// import
import java.util.*;
import java.lang.StringBuilder;

public class JavaCode10 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");

        System.out.println("Java Code 10");
        System.out.println("Java - StringBuilder");
        System.out.println("Simply put, StringBuilder was introduced in Java 1.5 as a replacement for StringBuffer.");
        System.out.println("");

        StringBuilder stringBuilder = new StringBuilder("Welcome to Baeldung Java Tutorial!");
        System.out.println(stringBuilder.toString());

        // Append characters
        stringBuilder.append(" We hope you enjoy your learning experience.");
        System.out.println("Append characters =");
        System.out.println(stringBuilder.toString());

        // Insert characters
        stringBuilder.insert(29, "awesome ");
        System.out.println("Insert characters =");
        System.out.println(stringBuilder.toString());

        // Replace characters
        stringBuilder.replace(11, 18, "Baeldung's");
        System.out.println("Replace characters =");
        System.out.println(stringBuilder.toString());

        // Delete characters
        stringBuilder.delete(42, 56);
        System.out.println("Delete characters =");
        System.out.println(stringBuilder.toString());

    }
}