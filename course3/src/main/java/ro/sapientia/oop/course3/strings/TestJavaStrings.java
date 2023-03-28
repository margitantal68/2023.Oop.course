package ro.sapientia.oop.course3.strings;

public class TestJavaStrings {
    public static String concatenateStrings(int n){
        String result = "";
        for (int i = 0; i < n ; i++) {
            result += 'a';
        }
        return result;
    }

    public static String concatenateStringBuffer(int n){
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n ; i++) {
            result.append('a');
        }
        return result.toString();
    }
    public static String concatenateStringBuilder(int n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            result.append('a');
        }
        return result.toString();
    }
}
