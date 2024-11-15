class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //Math.sqrt로 n의 제곱근 구하기
        double sqrt = Math.sqrt(n);
        int x = (int)sqrt;
        
        //double형인 sqrt가 양의 정수라면 (int로 바꾼 x와 값이 일치하면 ex. 12.0 == 12)
        if (sqrt == x) 
            // x+1의 제곱을 리턴
            answer = (long)(x+1)*(x+1);
        else
            // -1을 리턴
            answer = -1;
        
        return answer;
    }
}
