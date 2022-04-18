package practice_basic_day03;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String depo;
        do {
            System.out.println("değer giriniz");
            String str=scan.nextLine();

            if (!str.equals("x"))
            { System.out.println("program calışıyor");}
            depo=str;

        }while (!depo.equals("x"));
        System.out.println("programdan çıktınız");

    }
}
