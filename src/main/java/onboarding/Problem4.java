package onboarding;

public class Problem4 {
    static final char LOWER_FIRST_CASE = 'a';
    static final char LOWER_LAST_CASE = 'z';
    static final char UPPER_FIRST_CASE = 'A';
    static final char UPPER_LAST_CASE = 'Z';
    public static String solution(String word) {
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray())
            sb.append(changeReverseAlpha(c));

        return sb.toString();
    }

    /* 받은 매개변수를 청개구리 언어로 변경 */
    private static char changeReverseAlpha(char alpha) {
        if(isLowerAlpha(alpha)){
            alpha = (char) (LOWER_FIRST_CASE + LOWER_LAST_CASE - alpha);
            return alpha;
        }
        if(isUpperAlpha(alpha)){
            alpha = (char) (UPPER_FIRST_CASE + UPPER_LAST_CASE - alpha);
            return alpha;
        }
        return alpha;
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
