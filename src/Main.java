import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int taban,us,total=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban sayıyısını giriniz :");
        taban = input.nextInt();

        System.out.println("Üs sayısını giriniz:");
        us=input.nextInt();

        for(int i =1 ; i<=us ; i++){

            total=total*taban;
        }

        
        System.out.println("Sonuç = " + total);
    }
}