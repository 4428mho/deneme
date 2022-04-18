package practice_basic_day04;

import java.util.Arrays;

public class Q08_Arrays {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  double olarak yazdir
         */
        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double tplm = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].contains("$")) {
                    tplm += Double.parseDouble(arr[i][j].replace("$", "")) * 14.83;

                }
                else if (arr[i][j].contains("€")) {
                    tplm += Double.parseDouble(arr[i][j].replace("€", "")) * 16.39;
                }

            }

        }
        System.out.println(tplm);
    }
}