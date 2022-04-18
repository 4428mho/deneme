package practice_basic_day02;

import java.util.Scanner;

public class Q14_StringManipulation08 {

    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaz");
        String name1= scan.nextLine();
        System.out.println("yaz2");
        String name2= scan.nextLine();

        if ((name1.length())%2==0){
            System.out.println(name1.substring(0,((name1.length())/2))+name2+name1.substring((name1.length())/2));
        }



    }
}
