package Chapter1;

import java.util.Scanner;

public class Code1_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("별 개수 : ");
        int n = sc.nextInt();
        System.out.print("개행 기준 : ");
        int w = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("*");

            if(i%w==w-1)
                System.out.println();
        }

    if(n%w!=0) System.out.println();
    }
}
