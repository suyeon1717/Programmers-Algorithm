class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            for(int i=1; i<s.length(); i++){
                answer = answer * 10 + (s.charAt(i) -'0');
            }
            if(s.charAt(0) == '-')
                answer = answer * (-1);
        }
        else {
            for(int i=0; i<s.length(); i++){
                answer = answer * 10 + (s.charAt(i) -'0');
            }
        }
            
        
        return answer;
    }
}
