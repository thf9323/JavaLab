package day4;

public class day4_10 {
    public static void main(String[] args) {
        int i= 11;
        System.out.println("count start ");

        while(i--!=0){
            System.out.println(i);
            for(int j=0;j<2_000_000_000;j++){//한턴 쉬엄
                ;
            }
        }
        System.out.println("game over");
    }
}
