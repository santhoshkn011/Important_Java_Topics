/*
Method 2: Using equals() method
In Java, string equals() method compares the two given strings based on the data / content of the string.
If all the contents of both the strings are same then it returns true.
If all characters are not matched then it returns false.
 */
public class EqualsMethod{
    public static void main(String[] args) {
        // Get some Strings to compare
        String s1 = "A";
        String s2 = "A";
        String s3 = "a";
        String s4 = new String("A");

        // Compare s1 and s2
        // It should return true as they both
        // have the same content
        System.out.println(s1 + " .equals " + s2
                + ": " + s1.equals(s2));

        // Compare s1 and s3
        // It should return false as they both
        // have the different content
        System.out.println(s1 + " .equals " + s3
                + ": " + s1.equals(s3));

        // Compare s2 and s3
        // It should return false as they both
        // have the different content
        System.out.println(s2 + " .equals " + s3
                + ": " + s2.equals(s3));

        // Compare s1 and s4
        // It should return true as they both
        // have the same content
        System.out.println(s1 + " .equals " + s4
                + ": " + s1.equals(s4));
    }
}
