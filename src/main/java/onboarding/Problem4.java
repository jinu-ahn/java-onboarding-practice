package onboarding;

public class Problem4 {
    static final char LOWER_FIRST_CASE = 'a';
    static final char LOWER_LAST_CASE = 'z';
    static final char UPPER_FIRST_CASE = 'A';
    static final char UPPER_LAST_CASE = 'Z';
    public static String solution(String word) {
        String answer = "";
        return answer;
    }

    /* 대문자 알파벳인지 확인 */
    private static boolean isUpperAlpha(char alpha) {
        if(alpha >= UPPER_FIRST_CASE && alpha <= UPPER_LAST_CASE) return true;
        return false;
    }
    /* 소문자 알파벳인지 확인 */
    private static boolean isLowerAlpha(char alpha) {
        if(alpha >= LOWER_FIRST_CASE && alpha <= LOWER_LAST_CASE) return true;
        return false;
    }
}
