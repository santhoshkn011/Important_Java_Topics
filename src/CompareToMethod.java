/*
Method 3: Using compareTo() method
In java Comparable interface compares values and returns an int, these int values may be less than, equal, or greater than.
The java compare two string is based on the Unicode value of each character in the strings.
If two strings are different, then they have different characters at some index that is a valid index for both strings, or their lengths are different, or both.
Assuming index ‘i’ is where characters are different then compareTo() will return firstString.charAt(i)-secondString.charAt(i).
 */
public class CompareToMethod {
    public static void main(String[] args) {
        // Get some Strings to compare
        String s1 = "A";
        String s2 = "A";
        String s3 = "a";
        String s4 = new String("A");

        // Compare s1 and s2
        // It should return 0 as they both
        // have the same ASCII value
        System.out.println(s1 + " .compareTo " + s2
                + ": " + s1.compareTo(s2));

        // Compare s1 and s3
        // It should return -32 as they both
        // have the different ASCII value
        System.out.println(s1 + " .compareTo " + s3
                + ": " + s1.compareTo(s3));

        // Compare s3 and s2
        // It should return 32 as they both
        // have the different ASCII value
        System.out.println(s3 + " .compareTo " + s2
                + ": " + s3.compareTo(s2));

        // Compare s1 and s4
        // It should return 0 as they both
        // have the same ASCII value
        System.out.println(s1 + " .compareTo " + s4
                + ": " + s1.compareTo(s4));
    }
}
