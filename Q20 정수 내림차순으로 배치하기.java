import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // n을 string으로 변환한 후 char type 배열로
        char[] digits = Long.toString(n).toCharArray();

        Arrays.sort(digits); // 오름차순 정렬

        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse(); // 내림차순으로 reverse

        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}
