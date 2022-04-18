package practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   "Java ogrenmek123 Cok guzel@"      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

String k1="Java ogrenmek123 Cok guzel@";
String k2=k1.replaceAll("\\d","");
        System.out.println(k2.substring(0,k2.length()-1));
    }
}
