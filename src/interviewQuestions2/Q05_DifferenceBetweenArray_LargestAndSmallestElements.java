package interviewQuestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yazmak istediğiniz matris için eleman sayısı belirleyiniz  ");
        int x=scan.nextInt();
        int [] arr=new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println(i+". elemanı giriniz");
            int y=scan.nextInt();
            arr[i]=y;

        }

    }

}