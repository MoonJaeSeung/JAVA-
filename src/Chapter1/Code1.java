package Chapter1;

import java.util.Scanner;

public class Code1 {

    static int med3(int a,int b, int c){
        if(a>=b)
            if(b>=c)  //abc
                return b;
            else if(c>=a) //cab
                return a;
            else //acb
                return c;
        else if(a>c) //bac
            return a;
        else if(b>c) //b a=c
            return c;
        else
            return b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값 구하기");

        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();
        System.out.print("c의 값 : ");
        int c =sc.nextInt();

        System.out.println("중앙 값은 " + med3(a,b,c) + "입니다.");
    }

}
