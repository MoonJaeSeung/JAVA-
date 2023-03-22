package Chapter2;

import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 입력 : ");
        int num = sc.nextInt();

        int [] a = new int[num];
        int [] b=new int[num];

        Random rd = new Random(11);
        for(int i=0; i<num;i++){
            a[i] =rd.nextInt(11);
        }

        copy(a,b);
    }

    private static void copy(int[] a,int [] b) {
        for(int i=0;i<a.length;i++){

        }
    }
}
