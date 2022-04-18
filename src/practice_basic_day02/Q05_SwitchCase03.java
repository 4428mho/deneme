package practice_basic_day02;

import java.util.Scanner;

public class Q05_SwitchCase03 {

    // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("3 haneli bir sayı yazınız:");
        int sayı = scan.nextInt();
        int sonuç=(sayı/10)%10;
        switch (sonuç){
            case 0: System.out.println("sifir " + sonuç);break;
            case 1: System.out.println("bir " + sonuç);break;
            case 2: System.out.println("iki " + sonuç);break;
            case 3: System.out.println("üç " + sonuç);break;
            case 4: System.out.println("dört " + sonuç);break;
            case 5: System.out.println("beş " + sonuç);break;
            case 6: System.out.println("altı " + sonuç);break;
            case 7: System.out.println("yedi " + sonuç);break;
            case 8: System.out.println("sekiz " + sonuç);break;
            case 9: System.out.println("dokuz " + sonuç);break;

        }



    }
}
