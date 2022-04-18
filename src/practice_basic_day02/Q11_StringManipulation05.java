package practice_basic_day02;

import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dört kelime girin, her kelimeden sonra enter a basın");
        String k1=scan.nextLine();
        String k2=scan.nextLine();
        String k3=scan.nextLine();
        String k4=scan.nextLine();
        System.out.println(k1+" "+k2+"  "+k3+" "+k4);

        String k5="cesaret, insana, sinirlarini, ogretir";


    }
}
