package day4;
import java.util.*;

public class day4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("���ڸ� �Է��ϼ���. :");
        int num = scanner.nextInt();
        int sum =0;
        for(int i=1;i<=num; i++) {
            System.out.print(i + " + ");
            sum += i;
            
            

           
            }
            System.out.print(num + " = ");
            sum += num;
            System.out.println(sum);
        }
}
