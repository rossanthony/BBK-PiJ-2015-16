package q2;

public class StringUtils {
    private StringUtils() {
    }

    public static int eChecker(String s1, String s2) {
        int compareFlag = 0;
        if (s1.contains("e") && !s2.contains("e")) {
            compareFlag = -1;
        } else if (s2.contains("e") && !s1.contains("e")) {
            compareFlag = 1;
        }
        return (compareFlag);
    }

    public static String betterString(String s1, String s2,
                                      TwoStringPredicate tester) {
        return (tester.isBetter(s1, s2) ? s1 : s2);
    }
}
