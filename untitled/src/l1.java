import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        //1
        int hi = 0;
        while (hi < 10) {
            System.out.print("JAVA ");
            hi++;
        }
        //2
        for (int i = 0; i < 10; i++) {
            System.out.print("JAVA ");
        }
        //3
        int hii = 0;
        while (hii < 10) {
            System.out.println("JAVA ");
            hii++;
        }
        //4
        int year = 1980;
        while (year <= 2020) {
            if (year % 4 == 0) {
                System.out.println("Олимпиада "+year+" года");
            }
            year++;
        }
        //5
        for (int i = 1980; i <= 2020; i+=4) {
            System.out.println("Олимпиада "+i+" года");
        }
        //6
        Scanner x = new Scanner(System.in);
        int z = x.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(i+" x "+z+" = "+z*i);
        }
    }
}
