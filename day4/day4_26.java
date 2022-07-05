package day4;
import java.util.*;
public class day4_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("how star ? :");
        int star = scan.nextInt();
        int i = 1;

        while(i<=star){
            
            if(i % 2 ==1){
                System.out.print("*");
                i++;
            }else if(i % 2 == 0){
                System.out.print("+");
                i++;
            }



        }
    }
}
// int num = scanner.nextInt();
        
//             for(int i=1;i<=num;i++) {
//                 System.out.print("");  (--i!=0)