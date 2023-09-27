package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem7 {
    static final int USER_LOW_VALUE = 1;
    static final int USER_MAX_VALUE = 30;
    static final int FRIENDS_MIN_VALUE = 1;
    static final int FRIENDS_MAX_VALUE = 10000;
    static final int VISITOR_MIN_VALUE = 1;
    static final int VISITOR_MAX_VALUE = 10000;
    static final int ID_MIN_VALUE = 1;
    static final int ID_MAX_VALUE = 30;
    static final String REGEXP = "^[a-z]*$";
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }
    /* 유저 이름 유효성 검사 */
    private static boolean userValidation(String userName) {
        int nameLength = userName.length();
        if(nameLength >= USER_LOW_VALUE && nameLength <= USER_MAX_VALUE) return true;
        return false;
    }

    /* 친구 우효성 검사 */
    private static boolean friendsValidation(List<List<String>> friends){
        int friendsLength = friends.size();
        if(friendsLength >= FRIENDS_MIN_VALUE && friendsLength <= FRIENDS_MAX_VALUE) {
            for (List<String> friend : friends) {
                if(!idValidation(friend)) return false;
            }
            return true;
        }
        return false;
    }

    /* 방문자 유효성 검사*/
    private static boolean visitorValidation(List<String> visitors) {
        for (String visitor : visitors) {
            int visitorIdLength = visitor.length();
            if(visitorIdLength >= VISITOR_MIN_VALUE && visitorIdLength <= VISITOR_MAX_VALUE) {
                if(!idValidation(visitors)) return false;
            }
            else
                return false;
        }
        return true;
    }

    /* ID 유효성 검사 */
    private static boolean idValidation(List<String> visitors){
        for (String visitor : visitors) {
            int idLength = visitor.length();
            if(idLength >= ID_MIN_VALUE && idLength <= ID_MAX_VALUE) {
                if (!isLowerAlpha(visitor)) return false;
            }
        }
        return true;
    }

    /* ID 형식 유효성 검사 */
    private static boolean isLowerAlpha(String visitor) {
        if(visitor.matches(REGEXP)) return true;
        return false;
    }
}
