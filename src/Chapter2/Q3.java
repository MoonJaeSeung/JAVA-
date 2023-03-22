package Chapter2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {

    static int sum(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 입력 : ");
        int num = sc.nextInt();

        int [] a = new int[num];

        Random rd = new Random(11);
        for(int i=0; i<num;i++){
            a[i] =rd.nextInt(11);
        }
        System.out.println(Arrays.toString(a));


        System.out.println(" 모든 요소의 합은 "+ sum(a));
    }
}
