package onboarding;

import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        return answer;
    }

    /* 중복되는 문자열 찾기 */
    private static String duplicateString(String cryptogram) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (Character c :cryptogram.toCharArray()) {
            duplicateRemove(st,c);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    /* 중복되는 문자열 제거 */
    private static void duplicateRemove(Stack<Character> st,Character c){
        if(st.isEmpty()){
            st.push(c);
            return;
        }
        if(st.peek() == c){
            st.pop();
            return;
        }
        st.push(c);
    }

    /* 변경 전 문자열과 변경 후 문자열이 같은지 검증 */
    private static boolean isCompare(String cryptgram, String decryptgram){
        if(cryptgram.equals(decryptgram))
            return true;
        return false;
    }
}
