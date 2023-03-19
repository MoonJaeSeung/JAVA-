package Chapter1;

import java.util.Scanner;

public class Code7 {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();
        int sum=0;

        sum = (n+1) * (n/2) +(n%2==1?n/2 +1:0);

        System.out.println(sum);

        }
    }

