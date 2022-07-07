package day5_1;
import java.util.*;
public class day1 {
    public static void main(String[] args) {
        int[] ia1 =new int[10];
        int[] ia2 =new int[10];
    //    int[] ia3 =new int[]{100, 95, 80, 70, 60};
        int[] ia3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a','b','c','d'};
        
        for (int i= 0; i< ia1.length; i++) {
        	ia1[i] = i +1;
        }
        for (int i= 0; i< ia2.length; i++) {
        	ia2[i] = (int)(Math.random()*10) + 1;
	}
        for (int i= 0; i< ia1.length; i++) {
        	System.out.print(ia1[1]+",");
}
        System.out.println();
        System.out.println(Arrays.toString(ia2));
        System.out.println(Arrays.toString(ia3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(ia3);
        System.out.println(chArr);
    }
}
