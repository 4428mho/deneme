package interviewQuestions8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C1 {
    public static void main(String[] args) {
        ArrayList<Integer>arrList=new ArrayList<>(Arrays.asList(10,20,30,10,20,50));
        System.out.println("arrList = " + arrList);
        Set<Integer>set=new HashSet<>();
        arrdenSeteGecis(arrList,set);
        System.out.println("set = " + set);

        Set<Character>kerektersiz=new HashSet<>();
        karekterSeteEkle(kerektersiz,'a','b','l','h','t','d','l','h','2');
        System.out.println("kerektersiz = " + kerektersiz);
    }

    private static void karekterSeteEkle(Set<Character> kerektersiz,Character ...characters) {
        for (int i = 0; i <characters.length ; i++) {
            kerektersiz.add(characters[i]);
            
        }
    }

    private static void arrdenSeteGecis(ArrayList<Integer> arrList, Set<Integer> set) {
        for (Integer sayı:arrList
             ) {set.add(sayı);
        }
    }

}
