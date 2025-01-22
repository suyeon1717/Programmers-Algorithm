class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            // 공백이면 n 초기화
            if(c == ' '){
                n = 0;
                sb.append(c);
                continue;
            }
            // 짝수번째 문자는 대문자
            if(n%2 == 0) {
                sb.append(Character.toUpperCase(c));
            }
            // 홀수번째 문자는 소문자
            else {
                sb.append(Character.toLowerCase(c));
            }
            n++;
        }

        answer = sb.toString();
        return answer;
    }
}
