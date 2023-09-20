package onboarding;

import java.util.List;

class Problem1 {
    static final int FIRST_PAGE = 0;
    static final int MAX_PAGE = 400;
    static final int POBI_WIN = 1;
    static final int CRONG_WIN = 2;
    static final int DRAW = 0;
    static final int EXCEPTIONS_SITUATION = -1;
    static final int LIST_SIZE = 2;

    static boolean exception = false;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    /* 펼친 페이지가 첫페이지 또는 끝페이지인지 확인 */
    private static void firstOrMaxPageException(List<Integer> page) {
        for (Integer i : page) {
            if(i == FIRST_PAGE || i == MAX_PAGE)
                exception = true;
        }
    }

    /* 포비와 크롱의 리스트의 값이 2인지 확인 */
    private static void sizeValidator(int pageSize) {
        if(pageSize != LIST_SIZE)
            exception = true;
    }

    /* 왼쪽페이지가 홀수인지 확인 */
    private static void leftPageValidation(int leftPage){
        if(leftPage/2 == 1)
            exception = true;
    }

    /* 오른쪽페이지가 짝수인지 확인 */
    private static void rightPageValidation(int rightPage) {
        if(rightPage /2 == 0)
            exception = true;
    }

    /* 연속되는 페이지 인지 확인 */
    private static void continuityPage(List<Integer> page){
        int left = page.get(0);
        int right = page.get(1);

        if(right - left != 1)
            exception = true;
    }
}