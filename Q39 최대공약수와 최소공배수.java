class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        /**
         * 최대공약수 GCD
         * a > b 일 때,
         * r = a % b
         * a = b, b = r
         * r = a % b 반복 -> r = 0 일 때의 b 값이 최대공약수
         */
        int n1 = n;
        int m1 = m;
        int r = 0;

        if(m1 > n1) {
            int temp = n1;
            n1 = m;
            m1 = temp;
        }

        while (true) {
            r = n1 % m1;
            if(r == 0){
                answer[0] = m1;
                break;
            }
            n1 = m1;
            m1 = r;
        }

        /**
         * 최소공배수 LCM
         * (a * b) / GCD
         */

        answer[1] = n * m / answer[0];
        
        return answer;
    }
}
