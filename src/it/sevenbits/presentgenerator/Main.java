package it.sevenbits.presentgenerator;

import it.sevenbits.presentgenerator.present.Present;
import it.sevenbits.presentgenerator.present.PresentBuilder;
import it.sevenbits.presentgenerator.present.PresentPartsMap;

public class Main {
    public static void main(String[] args) {
        PresentPartsMap map = new PresentPartsMap();

        Present present = new PresentBuilder()
                .addPresentPart(map.getPresentPart("https://drive.google.com/file/d/"))
                .addPresentPart(map.getPresentPart("insert-key-here"))
                .addPresentPart(map.getPresentPart("/view?usp=sharing"))
                .build();

        System.out.println(present.open());
    }
}
