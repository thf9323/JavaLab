import java.util.Scanner;
public class day3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("*�� ����� ������ ���� �Է��ϼ���.>");
        
        int star = scanner.nextInt();

        for(int i=1;i<=star;i++) {             // i = 1 2 3
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


