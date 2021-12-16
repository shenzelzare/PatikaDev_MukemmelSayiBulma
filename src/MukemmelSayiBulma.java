import java.util.Scanner;

public class MukemmelSayiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        if (isMukemmelSayi(sayi)){
            System.out.println(sayi + " Mükemmel Sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel Sayi Degildir");
        }
    }

    public static boolean isMukemmelSayi(int gelenSayi){
        int result=0;
        for (int i = 1;i<gelenSayi;i++){
            if (gelenSayi%i==0){
                result+=i;
            }
        }
        if (result == gelenSayi){
            return  true;
        }
        else {
            return false;
        }
    }
}
