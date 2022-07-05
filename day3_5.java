package day3;
import java.util.Scanner;
public class day3_5 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //System.out.print("단을 입력하세요.>");
       // int num = scanner.nextInt();
        
        for(int i=1; i<=9; i++){
            if(i%2 == 0){
            System.out.printf("%d dan ea.>%n", i);

            for(int j=2; j<=9; j++){
                System.out.printf("%d * %d = %2d%n",i,j,i*j);
                j++;
            }
        }
    }
}
}
