package test;

public class A1 {
    /*
  Interview sorusu...
  Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

  Test data:
  Input = AAABBCDD
  output = A3B2C1D2
          */
    public static void main(String[] args) {

        String input = "AAABBCDDDDDDDD";
        frekans(input);
        

    }

    private static void frekans(String input) {
        int sayac = 0;
        String ouput = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                if (input.substring(i, i + 1).equals(input.substring(j, j + 1))) {
                    sayac++;
                }

            }
            if (!ouput.contains(input.substring(i,i+1))) {
                ouput +=input.substring(i,i+1)+sayac;
            } sayac = 0;
        }
        System.out.println("ouput = " + ouput);
    }
}
