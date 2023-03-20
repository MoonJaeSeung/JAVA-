package Chapter1;

import java.util.Scanner;

public class Code10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수를 입력하세요");
        int n = sc.nextInt();
        int N=0;

        while(n>1){
            n=n/10;
            N++;
            System.out.println(n);
        }

        System.out.println("자리수는 " + N + "이다");

    }
}
