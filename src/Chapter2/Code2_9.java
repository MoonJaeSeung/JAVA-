package Chapter2;

public class Code2_9 {
    public static void main(String[] args) {
        int counter = 0;                                // 곱셈과 나눗셈의 횟수
        int ptr = 0;                                    // 찾은 소수의 개수
        int[] prime = new int[500];                     // 소수를 저장하는 배열

        prime[ptr++] = 2;                                // 2는 소수입니다
        prime[ptr++] = 3;

        for(int n = 5; n<= 1000; n+=2){
            boolean flag = false;
            for(int i=1; prime[i] * prime[i] <= n ; i ++){
                counter += 2;
                if(n % prime[i]==0){
                    flag= true;
                    break;
                }
            }
            if(!flag){
                prime[ptr++] = n;
                counter++;
            }
        }
        for(int i=0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println("연산 횟수 : " + counter);
    }
}
