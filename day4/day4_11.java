package day4;
import java.util.*;

public class day4_11 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num!=0){
            sum += num%10;
            System.out.printf("sum= %3d num=%d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수의 합:"+sum);
    }
}
