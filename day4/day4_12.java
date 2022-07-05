package day4;
import java.util.*;
public class day4_12 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        
        while ((sum += ++i) <= 100){
            
            System.out.printf("%3d - %d%n", i, sum);
        }
    }
}
