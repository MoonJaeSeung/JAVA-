package Chapter1;

import java.util.Scanner;

public class Code1_14_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("별 개수 : ");
        int n = sc.nextInt();
        System.out.print("개행 기준 : ");
        int w = sc.nextInt();

        for(int i=0; i<n/w;i++){
            System.out.println("*".repeat(w));
        }

        int rest=n%w;
        System.out.println("*".repeat(rest));
    }
}
