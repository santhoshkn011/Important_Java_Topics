package com.stringcomparision;

/*
Method 4: Using equalsIgnoreCase() method
Java String equalsIgnoreCase() method is much similar to equals() method, except that case is ignored like in above example String object s4 compare to s3 then equals() method return false, but here in case of equalsIgnoreCase() it will return true.
Hence equalsIgnoreCase() method is Case Insensitive.
 */
public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        // Get some Strings to compare
        String s1 = "A";
        String s2 = "A";
        String s3 = "a";
        String s4 = new String("A");

        // Compare s1 and s2
        // It should return true as they both
        // have the same content
        System.out.println(s1 + " .equalsIgnoreCase " + s2
                + ": " + s1.equalsIgnoreCase(s2));

        // Compare s1 and s3
        // It should return true as they both
        // have the same content being case insensitive
        System.out.println(s1 + " .equalsIgnoreCase " + s3
                + ": " + s1.equalsIgnoreCase(s3));

        // Compare s2 and s3
        // It should return true as they both
        // have the same content being case insensitive
        System.out.println(s2 + " .equalsIgnoreCase " + s3
                + ": " + s2.equalsIgnoreCase(s3));

        // Compare s1 and s4
        // It should return true as they both
        // have the same content
        System.out.println(s1 + " .equalsIgnoreCase " + s4
                + ": " + s1.equalsIgnoreCase(s4));
    }
}
