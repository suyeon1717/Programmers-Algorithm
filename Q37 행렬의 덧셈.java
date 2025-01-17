class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        
        for(int i = 1; i<= arr1.length; i++) {
            for(int j= 0; j<arr1[i-1].length; j++) {
                answer[i-1][j] = arr1[i-1][j] + arr2[i-1][j];
            }
        }
        
        return answer;
    }
}
