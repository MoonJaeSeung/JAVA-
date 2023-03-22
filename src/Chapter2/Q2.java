package Chapter2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2  {
    //--- 배열 요소 a[idx1]과 a[idx2]를 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=tmp;
    }

    //--- 배열 a의 요소를 역순으로 정렬 ---//
    static void reverse(int[] a) {
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length/2;i++){
            System.out.println(a[i] + "과 "+a[a.length-i-1] + "을 교환합니다");
            swap(a,i,a.length-i-1);
            System.out.println(Arrays.toString(a));
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수는  : ");
        int n= stdIn.nextInt();

        System.out.println();

        Random rd = new Random();

        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[i] = rd.nextInt(11);
        }

        reverse(x);

        }
}
