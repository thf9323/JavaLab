package day4;
import java.util.*;
public class day4_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        if (a>b){
        int t =a;
        a= b;
        b= t;
    }
    do {
        System.out.print(a + " ");
        a = a + 1;
    }while(a <= b);
    System.out.println();
    
}
}