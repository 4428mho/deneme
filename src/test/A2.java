package test;

import java.util.Scanner;

public class A2 {
    /*
  AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
  Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
  "abcdefghijklmnopqrstuvwxyz"; 26 harf
  "zyxwvutsrqponmlkjihgfedcba";
 */

    public static void main(String[] args) {//alfabede sayıdoğrusu üzerinde kayma miktarı ile hesaplandı
        Scanner scan=new Scanner(System.in);
        System.out.print("sifre icin metin giriniz = ");
        String metin=scan.nextLine().toLowerCase();

        for (int i = 0; i < metin.length(); i++) {
            int index='z'-metin.charAt(i);
            System.out.print((char)('a'+index ));

        }
        System.out.println();
        System.out.print("sifre icin metin giriniz  = ");
        String metin2=scan.nextLine().toLowerCase();
        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i <metin2.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if(metin2.charAt(i)==str1.charAt(j)){
                    System.out.print(str2.charAt(j));
                }

            }
        }

    }
}

