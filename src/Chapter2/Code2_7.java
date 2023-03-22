package Chapter2;

public class Code2_7 {
    public static void main(String[] args) {
        int count = 0;

        for(int i=2;i<=1000;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0) {
                    count++;
                    break;
                }
            }
            if(count==0) System.out.println(i);
            count=0;
        }

    }
}
