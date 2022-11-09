import java.text.Collator;

/*
Method 5: Using compare() method
In Java for locale specific comparison, one should use Collator class which is in java.text package.
The one most important feature of Collator class is the ability to define our own custom comparison rules.
 */
public class CompareMethod {
    public static void main(String[] args) {
        // Get Collator instance
        Collator collator = Collator.getInstance();

        // Get some Strings to compare
        String s1 = "A";
        String s2 = "A";
        String s3 = "a";
        String s4 = new String("A");

        // Compare s1 and s2
        // It should return 0 as they both
        // have the same ASCII value
        System.out.println(s1 + " collator.compare " + s2
                + ": " + collator.compare(s1, s2));

        // Compare s1 and s3
        // It should return 1
        System.out.println(s1 + " collator.compare " + s3
                + ": " + collator.compare(s1, s3));

        // Compare s3 and s2
        // It should return -1
        System.out.println(s3 + " collator.compare " + s2
                + ": " + collator.compare(s3, s2));

        // Compare s1 and s4
        // It should return 0 as they both
        // have the same ASCII value
        System.out.println(s1 + " collator.compare " + s4
                + ": " + collator.compare(s1, s4));
    }
}
