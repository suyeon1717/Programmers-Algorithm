class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int cnt = 0; // 약수의 개수
            for(int j=1; j<=i; j++){
                // 약수일 때 cnt++
                if(i % j == 0){
                    cnt++;
                }
            }

            answer = (cnt % 2 == 1)? answer - i : answer + i;
        }
        
        return answer;
    }
}
