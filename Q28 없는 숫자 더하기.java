class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        // numbers의 모든 원소는 서로 다릅니다. -> 원소 중복 x
        answer = 45;
        for(int i=0; i<numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}
