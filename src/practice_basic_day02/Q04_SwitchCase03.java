package practice_basic_day02;

import java.util.Scanner;

public class Q04_SwitchCase03 {
    /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin yazınız");
        String metin=scan.nextLine().toLowerCase();
        if (metin.substring(0, 1).contains("a")) {
            System.out.println("==> Java is easy");
        }else if (metin.substring(0, 1).contains("b")) {
            System.out.println("==> Java is fun");
    }else if (metin.substring(0, 1).contains("c")) {
            System.out.println("==> I need to study :)");
    }else {
            System.out.println("java hikaye");
        }
}}
