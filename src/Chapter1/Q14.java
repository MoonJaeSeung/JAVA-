package Chapter1;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        triangleLU(n);
    }

    private static void triangleLU(int n) {
        for(int i=1;i<=n;i++){
            System.out.print(" ".repeat(n-i));
            System.out.println("*".repeat(i));
        }
    }
}
