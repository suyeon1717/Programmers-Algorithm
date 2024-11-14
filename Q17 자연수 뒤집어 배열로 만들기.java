class Solution {
    public int[] solution(long n) {
        // int[] answer = {};
        
        String num = Long.toString(n);
        String reversenum = new StringBuilder(num).reverse().toString();
        int[] answer = new int[reversenum.length()];
        
        for(int i=0; i<reversenum.length(); i++){
            char c = reversenum.charAt(i);
            answer[i] = c - '0';
        }
        return answer;
    }
}
