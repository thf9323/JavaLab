package day4;
import java.util.*;
public class day4_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���");

        int num;
        int sum = 0;

        while(true){
            System.out.println( " >> ");
            num = scanner.nextInt();
            
            if(num != 0){
                sum += num;
            }else {
                break;
            }
        }

        System.out.println(sum);


    }
}
