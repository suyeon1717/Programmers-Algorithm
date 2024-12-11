class Solution {
    public String solution(String s) {
        String answer = "";

      // char Array로 만들어서 sort -> StringBuilder reverse -> to String 해도 됨
        
        StringBuilder sb = new StringBuilder();
        sb.insert(0,s);

        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j<s.length(); j++){
                if(sb.charAt(i) < sb.charAt(j)){
                    char c = sb.charAt(j);
                    sb.replace(j,j+1, sb.charAt(i)+"");
                    sb.replace(i, i+1,c+"");
                }
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}
