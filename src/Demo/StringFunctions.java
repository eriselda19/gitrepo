package src.Demo;

public class StringFunctions {

    public static void main(String[] args) {
        String string_var1="string functions program";
        String string_var2="string functions";

        //  Commonly used string functions
        System.out.println("String operations are");
        //  Getting character at a specific position
        System.out.println(string_var1.charAt(2));
        //  Getting unicode character at a specific index
        System.out.println(string_var1.codePointAt(3));
        //  Getting unicode character before the specific index
        System.out.println(string_var1.codePointBefore(1));
        //  Getting unicode character in between two indexes
        System.out.println(string_var1.codePointCount(0,9));
        //  Compare two strings lexicographically based on unicode value
        System.out.println(string_var1.compareTo(string_var2));
        // Compare two strings lexicographically ignoring case
        System.out.println(string_var1.compareToIgnoreCase(string_var2));
        //  Append one string to another one
        System.out.println(string_var1.concat(string_var2));
        //  Checks wether a string contains another string
        System.out.println(string_var1.contains(string_var2));
        //  Checks wether string ends with specific characters
        System.out.println(string_var1.endsWith("gram"));
        //  Compares if the strings are equal
        System.out.println(string_var1.equals(string_var2));
        //  Compares if the strings are equal ignoring the case
        System.out.println(string_var1.equalsIgnoreCase(string_var2));
        //  hashcode for a string
        System.out.println(string_var1.hashCode());
        //  Gets the position of the first occurrence  of specific characters
        System.out.println(string_var1.indexOf("program"));
        String string_var3="demo";
        System.out.println(string_var3.isEmpty());
        System.out.println(string_var3.lastIndexOf("em"));
        //  Length
        System.out.println(string_var3.length());
        System.out.println(string_var3.startsWith("d"));
        String string_var4="DEMO";
        System.out.println(string_var4.toLowerCase());
        System.out.println(string_var3.toUpperCase());

        String string_var5="   Hello World    ";
        System.out.println(string_var5.trim());





    }
}
