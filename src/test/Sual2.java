package test;


import java.util.ArrayList;

public class Sual2 {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        randomEkle(list);


    }

    private static void randomEkle(ArrayList<Integer> list) {

        int sayac=0;
        for (int i = 0; i < 10; i++){
            list.add((int) (Math.random()*20));
            if(list.get(i)%2==0){
                sayac++;
                list.set(i,111);
            }
        }
        System.out.println("111 ler eklendikten sonra liste =  "+list);
        if (sayac==0){
            System.out.println("listede çiftsayı yok");
        }
    }
}
