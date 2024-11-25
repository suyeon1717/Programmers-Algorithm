import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int item : arr){
            if(item % divisor == 0)
                answerList.add(item);
        }

        if(answerList.isEmpty())
            answerList.add(-1);
        
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}
