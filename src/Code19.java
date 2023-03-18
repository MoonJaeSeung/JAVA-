import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

    static String [] name = new String[1000];
    static String [] number = new String[1000];
    static int n=0;

    public static void main(String[] args){



        try {
            Scanner sc = new Scanner(new File("input.txt"));

            while(sc.hasNext()){
                name[n]=sc.next();
                number[n]=sc.next(); //input 파일의 띄어쓰기 오류
                n++;
            }


            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("no file");


//            return; //main을 종료시키는거니까 프로그램 종료 main이 아닌 함수에서 return문이면 그 함수를 종료
            System.exit(9);  // 프로그램을 종료하라 일반적으로 0은 정상적 종료 1은 비정상적 종료를 의미
        }

        bubbleSort();

        for(int i=0; i<n; i++) System.out.println(name[i] + " : " + number[i]);

    }

    static void bubbleSort(){
        for(int i=n-1; i>0;i--){
            for(int j=0;j<i;j++){
                if(name[j].compareTo(name[j+1])>0){  // name[j]가 더 클때 1 같으면 0 작으면 음수를 반환
                    String tmp = name[j];
                    name[j]=name[j+1];
                    name[j+1]= tmp;

                    tmp = number[j];
                    number[j]=number[j+1];
                    number[j+1]= tmp;

                }
            }
        }
    }
}
