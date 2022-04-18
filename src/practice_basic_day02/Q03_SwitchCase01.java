package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ders programı için haftanın kaçıncı gününde olduğunuzu giriniz: ");
        int hafta=scan.nextInt();
        switch (hafta){
            case 1:
                System.out.println("pazartesi java");
                break;
            case 2:
                System.out.println("salı java");
                break;
            case 3:
                System.out.println("çarşamba sql");
                break;
            case 4:
                System.out.println("perşembe selenyum");
                break;
            case 5:
                System.out.println("cuma selenyum");
                break;
            case 6:
                System.out.println("cumartesi sql");
                break;
            case 7:
                System.out.println("tatil");
                break;
            default:
                System.out.println("geçerli bir gün değeri giriniz");
        }









    }
}
