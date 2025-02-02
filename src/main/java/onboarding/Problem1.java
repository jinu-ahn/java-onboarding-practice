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
        firstOrMaxPageException(pobi);
        firstOrMaxPageException(crong);

        sizeValidator(pobi.size());
        sizeValidator(crong.size());

        leftPageValidation(pobi.get(0));
        leftPageValidation(crong.get(0));

        rightPageValidation(pobi.get(1));
        rightPageValidation(crong.get(1));

        continuityPage(pobi);
        continuityPage(crong);

        if(exception) return EXCEPTIONS_SITUATION;

        int pobiScore = calculatorScore(pobi);
        int crongScore = calculatorScore(crong);

        if(pobiScore > crongScore) return POBI_WIN;
        if(pobiScore < crongScore) return CRONG_WIN;
        return DRAW;
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

    /* 계산 결과 리턴 */
    private static int calculatorScore(List<Integer> page) {
        int leftScore = calculatorAddOrMultiplyScore(page.get(0));
        int rightScore = calculatorAddOrMultiplyScore(page.get(1));

        return Math.max(leftScore,rightScore);
    }

    /* 스코어 계산 */
    private static int calculatorAddOrMultiplyScore(int pageNum) {
        int thirdDigit = 0;
        int secondDigit = 0;
        int firstDigit = 0;

        if (pageNum > 10 && pageNum < 100) {
            secondDigit = (pageNum % 100) / 10;
            firstDigit = pageNum % 10;

            int addScore = secondDigit + firstDigit;
            int multiplyScore = secondDigit * firstDigit;
            return Math.max(addScore,multiplyScore);
        }

        if(pageNum > 100){
            thirdDigit = pageNum / 100;
            secondDigit = (pageNum % 100) / 10;
            firstDigit = pageNum % 10;

            int addScore = thirdDigit + secondDigit + firstDigit;
            int multiplyScore = thirdDigit * secondDigit * firstDigit;
            return Math.max(addScore,multiplyScore);
        }

        return pageNum;
    }

}