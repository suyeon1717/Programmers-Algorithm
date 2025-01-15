class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        
        if(!(s.length() == 4 || s.length() == 6)) {
            answer = false;
        }
        
        try{
            num = Integer.valueOf(s);
        } catch(Exception e) {
            answer = false;
        }
        
        return answer;
    }
}
