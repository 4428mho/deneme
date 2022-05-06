package interviewQuestions8;

import java.util.*;

public class C4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> grupIsimVeUyeler = new HashMap<>();
        ArrayList<String> devTeam =new ArrayList<>(Arrays.asList("Abdullah", "Kutay", "Enes Faruk", "Yasin"));
        ArrayList<String> qaTeam =new ArrayList<>(Arrays.asList("Kadir", "Seher", "Gokhan", "Bahattin"));
        grupIsimVeUyeler.put("Development Team", devTeam);
        grupIsimVeUyeler.put("QA Team", qaTeam);
        System.out.println("grupIsimVeUyeler = " + grupIsimVeUyeler);
        //grupIsimVeUyeler = {QA Team=[Kadir, Seher, Gokhan, Bahattin], Development Team=[Abdullah, Kutay, Enes Faruk, Yasin]}
        //Bolum2
        //1.yol -> value lardan giderek
        Collection<ArrayList<String>> values = grupIsimVeUyeler.values();
        for (ArrayList<String> kisi:values
        ) {
            System.out.println(kisi.size()); // ikisi icin de 4
        }
        //2.yol -> key lerden giderek
        Set<String> keys = grupIsimVeUyeler.keySet(); //keySet() key leri set olarak dondurur
        for (String key :keys
        ) {
            ArrayList<String> grupList =grupIsimVeUyeler.get(key);
            System.out.println("gruptaki uye sayisi :" + key + " " + grupList.size());
            //gruptaki uye sayisi :QA Team 4
            //gruptaki uye sayisi :Development Team 4
        }
    }
    }

