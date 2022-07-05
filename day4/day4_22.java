package day4;
import java.util.*;
public class day4_22 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = 0;
        while(true){
        System.out.print("number : ");
        num = scanner.nextInt();

        if(100 <= num && num >= 999){
            //System.out.printf("number = %d",num);
            break;
        }
        else{
            System.out.printf("number = %d",num);
            
        }
        
        
            
        }
    }
}
