package practice_basic_day03;

import java.util.Scanner;

public class Q04_MethodCreation04 {
        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */


		/*

		Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));

	        */
        public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("ne istiysan yaz");
        String sayi=scan.nextLine();
        String sayi1=sayi.replaceAll("\\D","");
            System.out.println("sayi1 = " + sayi1);
        int sayi2=Integer.parseInt(sayi1);
            System.out.println("sayi2 = " + sayi2);
        int toplam=0;
           int rakam=0;
            for (int i = 0; i <= sayi1.length(); i++) {
                rakam=sayi2%10;
                toplam+=rakam;
                sayi2/=10;
            }

            System.out.println("toplam = " + toplam);
}
}