package practice_basic_day01;

public class Q03_EscapeSequences {
    public static void main(String[] args) {
        int sayi=564;
        int sicaklik=44;
        System.out.println(sayi);
        System.out.println("sicaklik = " + sicaklik);
        int myAge=55;

        int year=2022, mounth=3, day=2;
        year=1999;
        int x;
        int y=1564;
        x=1546;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

         /*
 \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
         \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
         \\: prints a back slash :\ (ters slash) yazdirir
         \': prints single quote :' tek tirnak yazdirir.
         \": prints double quote :"" cift tirnak yazdirir.
\: backslash
/:front slash
*/
        System.out.println("\t");
        System.out.println("  \"hello\", \" world  \\//");

        System.out.println("\"Zaruret\" insanı\n\'kaşif\' yapar  :)");


    }
}
