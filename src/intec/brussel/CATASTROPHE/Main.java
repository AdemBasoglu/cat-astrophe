package intec.brussel.CATASTROPHE;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NorweiganForestCat norweiganForestCat1=new NorweiganForestCat('S','L'," black and white",6,"NFC1",4,123,11);
        SiameseCat siameseCat1=new SiameseCat('S','S',"Colorpoint",5,"SC1",3,100,20);
        SiameseCat siameseCat2=new SiameseCat('S','S',"Yellow",7,"SC2",1,123,9);
        PersianCat persianCat1=new PersianCat('S','L',"Multicolor",7,"PC1",1,123,234);
        TurkishVanCat turkishVanCat1=new TurkishVanCat('S','L',"White",7,"Boncuk",2,345,45,"BlueEyes");
        TurkishVanCat turkishVanCat2=new TurkishVanCat('S','L',"Black",7,"Minnos",7,134,38,"Black");
        AndeanMountainCat andeanMountainCat1=new AndeanMountainCat('S','L',"Multi color",9,"AMC1",5,123,27);

        ArrayList<Felis>allCats=new ArrayList<>();
        allCats.add(norweiganForestCat1);
        allCats.add(siameseCat1);
        allCats.add(siameseCat2);
        allCats.add(persianCat1);
        allCats.add(turkishVanCat1);
        allCats.add(turkishVanCat2);
        allCats.add(andeanMountainCat1);

        for (Felis eachCat :allCats
             ) {
            System.out.println();
            System.out.printf("%s\n", eachCat);

        }
        System.out.println("*************************************************************************************");
        PersianCat pc = new PersianCat('S','L',"Multicolor",7,"PC1",1,123,234); //krijgt shelterNo: 123 en badgeNo: 234
        SiameseCat sc= new SiameseCat('S','L',"Multicolor",7,"PC1",1,123,234); //krijgt shelterNo: 123 en badgeNo: 234 → De equals methode geeft TRUE terug!

        System.out.println("Copycats resultat is : "+ pc.equals(sc));


        System.out.println("If an animal doesnt live counter is : "+ Animal.counter);
        System.out.println("If an animal doesnt live vaccinnationcount is : "+ Felis.getVaccinationCount());



        PersianCat pcp = new PersianCat('S','L',"Multicolor",7,"PC1",1,-231,231); //should never mines number or groter then 999



    }


}
