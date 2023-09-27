package onboarding;

import java.util.Arrays;
import java.util.List;

public class Problem3 {
    static final char THREE = '3';
    static final char SIX = '6';
    static final char NINE = '9';
    static List<Character> claps = Arrays.asList(THREE,SIX,NINE);
    public static int solution(int number) {
        int clapCount = 0;

        for(int checkNumber=1;checkNumber<=number;checkNumber++)
            clapCount = clap(checkNumber,clapCount);

        return clapCount;
    }

    /* 손뼉 횟수 계산 */
    private static int clap(int number, int clapCount){
        String cNumber = String.valueOf(number);
        for (char c : cNumber.toCharArray()) {
            for (char clap : claps) {
                if(c == clap){
                    clapCount++;
                }
            }
        }
        return clapCount;
    }
}
