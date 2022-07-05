package day4;
import java.util.Scanner;
import java.util.Random;
public class day4_23 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int no = 10 + rand.nextInt(90);
        System.out.println("number start");
        System.out.println("10 ~ 99 number.  ");
        int x;
            do{
            System.out.print("what number??");
            x= scan.nextInt();
            
            if(x > no){
                System.out.println("low");

            }else if(x < no){
                System.out.println("high");
            }
                
            }while(x != no);
            System.out.print("ok");
            
        
    }
}
