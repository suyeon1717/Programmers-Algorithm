class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String x_str = "" + x;
        int hap = 0;
        
        for (int i=0; i<x_str.length(); i++){
            hap += (int) x_str.charAt(i) - '0';
        }
        
        if (x % hap != 0)
            answer = false;
        
        return answer;
    }
}
