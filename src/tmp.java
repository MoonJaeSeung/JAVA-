// 1,000 이하의 소수를 나열(버전 1）

class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;        // 나눗셈 횟수
        int ptr=0; //찾은 소수의 개수
        int [] prime = new int[500];

        prime[ptr++] = 2;


        for (int n = 3; n <= 1000; n+=2) {
            int i;
            for (i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0)    // 나누어떨어지면 소수가 아님
                    break;         // 반복은 더 이상 불필요
            }
            if (ptr == i) prime[ptr++] = n;
        }
            for(int i=-0;i<ptr;i++) System.out.println(prime[i]);


        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}