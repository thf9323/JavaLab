package day4;
public class day4_3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i : arr){
            System.out.println(i);
        }
        for(int tmp: arr){
            System.out.printf("%d", tmp);
            sum += tmp;
        }
        
        

         System.out.println();
         System.out.println("sum="+sum);
        
        }
    }

