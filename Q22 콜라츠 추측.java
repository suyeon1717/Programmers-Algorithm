class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long) num;

        do{
            if(n == 1)
                break;

            else if(answer == 500){
                n = 1;
                answer = -1;
                break;
            }
            else if(n % 2 == 0){
                n /= 2;
                answer ++;
            }
            else if(n % 2 == 1){
                n = n * 3 + 1;
                answer ++;
            }
        }while(num != 1);

        return answer;
    }
}
