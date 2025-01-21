class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";

        // 3진법
        while(n > 0) {
            str += (n % 3);
            n /= 3;
        }

        // 3진법을 10진법으로
        answer = Integer.parseInt(str,3);
        
        return answer;
    }
}
