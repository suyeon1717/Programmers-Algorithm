class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();

        for(int i = 0; i <phone_number.length()-4; i++){
            arr[i] = '*';
        }

        answer = String.valueOf(arr);
        return answer;
    }
}
