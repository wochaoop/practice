package src.com.xiaoluo.study;

public class Length {
    static String greeting = "Hello";

    public static void main(String[] args) {
        int n = greeting.length();

        int cpCount = greeting.codePointCount(0, greeting.length());

        char first = greeting.charAt(0);
        char last = greeting.charAt(4);

        int i = 2;
        int index = greeting.offsetByCodePoints(0, i);
        int cp = greeting.codePointAt(index);

        System.out.println(index);
        System.out.println(cp);
    }
}
