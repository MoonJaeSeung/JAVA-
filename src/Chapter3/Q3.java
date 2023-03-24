package Chapter3;

import java.util.Scanner;

public class Q3 {

    static int searchIdx(int[] x,int num, int ky, int[] y){
        int count = 0;
        for(int i=0;i<num;i++){
            if(x[i]==ky){
                y[count++]=i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];					// 요솟수가 num 인 배열
        int[] y = new int[num];					// 요솟수가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }
        System.out.print("검색 값 : "); 					// 키값을 입력받음
        int ky = stdIn.nextInt();

        int count = searchIdx(x, num, ky, y);		// 배열 x안의 값이 ky인 요소를 y에 copy

        if (count == 0)
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        else
            for (int i = 0; i < count; i++)
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
    }
}
