package day4;
import java.util.*;

public class day4_14 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요 : ");
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("low ");
            }else if(input < answer){
                System.out.println("high");
            }
        }while(input != answer);
        System.out.println("정답입니다.");
    }
}
