package Chapter1;

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();

        int b;
        do{
            System.out.println("b의 값 : ");
            b=stdIn.nextInt();
        }while(b<=a);

        System.out.println("b - a는 " + (b-a) + "입니다");

    }
}
