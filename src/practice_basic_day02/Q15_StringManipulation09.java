package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaz");
        String name1= scan.nextLine();
        int x=(name1.length()-1)/2;

        if(name1.length()%2!=0){
            System.out.println(name1.substring(x,x+1));
        }else {
            System.out.println("olmadı");
        }



    }
}