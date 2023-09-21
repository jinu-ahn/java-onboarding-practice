package onboarding;

import java.lang.reflect.Array;
import java.util.*;

public class Problem5 {
    static final int FIFTY_THOUSAND = 50000;
    static final int TEN_THOUSAND = 10000;
    static final int FIVE_THOUSAND = 5000;
    static final int ONE_THOUSAND = 1000;
    static final int FIVE_HUNDRED = 500;
    static final int ONE_HUNDRED = 100;
    static final int FIFTY = 50;
    static final int TEN = 10;
    static final int ONE = 1;

    static List<Integer> div = Arrays.asList(FIFTY_THOUSAND,TEN_THOUSAND,FIVE_THOUSAND,ONE_THOUSAND,FIVE_HUNDRED,ONE_HUNDRED,FIFTY,TEN,ONE);
    public static List<Integer> solution(int money) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (Integer i : div) {
            answer.add(exchange(money,i));
            money = money % i;
        }
        return answer;
    }
    /* 환전 */
    private static int exchange(int money,int i) {
        return money/i;
    }
}
