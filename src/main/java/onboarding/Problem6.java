package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem6 {
    static final int EMAIL_MIN_LENGTH = 11;
    static final int EMAIL_MAX_LENGTH = 20;
    static final int NICKNAME_MIN_LENGTH = 1;
    static final int NICKNAME_MAX_LENGTH = 20;
    static final String DOMAIN = "email.com";
    static HashMap<String,Integer> map = new HashMap<>();
    static List<String> answer = new ArrayList<>();
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    /* 도메인 형식이 맞는지 검증 */
    private static boolean domainValidation(String email){
        if(email.equals(DOMAIN)) return true;
        return false;
    }

    /* 이메일 길이 검증 */
    private static boolean emailValidation(String email) {
        if(email.length() >= EMAIL_MIN_LENGTH && email.length() <= EMAIL_MAX_LENGTH) return true;
        return false;
    }

    /* 닉네임 길이 검증*/
    private static boolean nicknameValidation(String nickname){
        if(nickname.length() >= NICKNAME_MIN_LENGTH && nickname.length() <= NICKNAME_MAX_LENGTH) return true;
        return false;
    }
}
