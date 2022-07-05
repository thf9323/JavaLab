package day4;
import java.util.*;;
public class day4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("(1) squre");
            System.out.println("(2) root");
            System.out.println("(3) log");
            System.out.println("choose number? (1~3, 0: done )>");
            int num = scanner.nextInt();

            if (num == 0){
                break;
            }else if(1 <= num && num <=3){
                System.out.printf(" U choosed number %d%n",num);
            }else{
                System.out.println("nope");
            }
        }
        System.out.println("end");
        
    }
}
        