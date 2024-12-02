import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        // 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        else{
            // 최소값 찾기
            int min = arr[0];
            for(int i = 1; i<arr.length; i++){
                if(arr[i] < min)
                    min = arr[i];
            }

            // answer 배열 생성
            answer = new int[arr.length - 1];

            int i = 0;

            // answer에 값 넣기
            for(int j = 0; j<arr.length; j++){
                if(arr[j] != min)
                    answer[i++] = arr[j];
            }
        
        }
        
        return answer;
    }
}
