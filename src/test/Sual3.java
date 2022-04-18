package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sual3 {
    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.


    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
        String metin=scan.nextLine();

       hackerDili(metin);

    }

    private static void hackerDili(String metin) {
        String arr[]=new String[metin.length()];

        for (int i = 0; i < metin.length(); i++) {
            arr[i]=metin.substring(i,i+1);
            System.out.print(arr[i]);
        }
        System.out.println();

        for (int i = 0; i < metin.length(); i++) {
            if(arr[i].toLowerCase().contains("s")){
                arr[i]="5";
            } if(arr[i].toLowerCase().contains("a")){
                arr[i]="4";
            } if(arr[i].toLowerCase().contains("e")){
                arr[i]="3";
            } if(arr[i].toLowerCase().contains("i")){
                arr[i]="1";
            } if(arr[i].toLowerCase().contains("o")){
                arr[i]="0";
            }
            System.out.print(arr[i]);

        }

        }
    }
