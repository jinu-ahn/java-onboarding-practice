package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        return answer;
    }

    /* 손뼉 횟수 계산 */
    private static int clap(int number, int clapCount){
        String cNumber = String.valueOf(number);
        for (char c : cNumber.toCharArray()) {
            if(c == '3' || c == '6' || c == '9')
                clapCount++;
        }
        return clapCount;
    }
}
