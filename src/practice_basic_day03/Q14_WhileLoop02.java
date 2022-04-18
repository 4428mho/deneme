package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir asyı giriniz");
        int x = scan.nextInt();

            for (int i = 1; i < x; i++) {
                System.out.print(i+ "   ");
                i++;
            }
        }
    }
