/*
Method 1: using == operator
Double equals operator is used to compare two or more than two objects,
If they are referring to the same object then return true, otherwise return false.
String is immutable in java. When two or more objects are created without new keyword,
then both object refer same value. Double equals operator actually compares objects references.
 */
public class EqualsOperator {
    public static void main(String[] args) {
        // Get some Strings to compare
        String s1 = "A";
        String s2 = "a";
        String s3 = "A";
        String s4 = new String("A");

        // Compare s1 and s2
        // It should return false as they both
        // refer to different object in memory
        System.out.println(s1 + " == " + s2
                + ": " + (s1 == s2));

        // Compare s1 and s3
        // It should return true as they both
        // refer to same object in memory
        System.out.println(s1 + " == " + s3
                + ": " + (s1 == s3));

        // Compare s2 and s3
        // It should return false as they both
        // refer to different object in memory
        System.out.println(s2 + " == " + s3
                + ": " + (s2 == s3));

        // Compare s1 and s4
        // It should return false as they both
        // refer to different object in memory
        System.out.println(s1 + " == " + s4
                + ": " + (s1 == s4));
    }
}