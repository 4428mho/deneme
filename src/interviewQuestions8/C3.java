package interviewQuestions8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        ArrayList<Integer>arrlist=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        for (int i = 1; i < 6; i++) {
            System.out.print("sayi "+i+"=");
            arrlist.add(scan.nextInt());

        }
        Collections.sort(arrlist,Collections.reverseOrder());
        System.out.println("arrlist terssıralı= " + arrlist);
        Collections.shuffle(arrlist);
        System.out.println("arrlist sufle = " + arrlist);

        Collections.rotate(arrlist,3);
        System.out.println("arrlist 3 kaymış hali= " + arrlist);

        Integer max=Collections.max(arrlist);
        Integer min=Collections.min(arrlist);
        System.out.println("min="+min+"\nmax="+max);
        Collections.replaceAll(arrlist,max,min);
        System.out.println("arrlist Çorba = " + arrlist);
    }
}
