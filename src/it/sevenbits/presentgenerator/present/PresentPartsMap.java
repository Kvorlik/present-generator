package it.sevenbits.presentgenerator.present;

import java.util.HashMap;

public class PresentPartsMap {
    private final HashMap<String, String> map = new HashMap<>();

    public PresentPartsMap(){
        map.put("part-one", "https://youtube.com/watch?v=");
        map.put("part-two", "dQw4w9WgXcQ");
        map.put("wrong-answer-1", "ksdjfs8d6fy");
        map.put("wrong-answer-2", "9sdshvsdSAK");
        map.put("wrong-answer-3", "iaf7uASFkjf");
        map.put("wrong-answer-4", "2v2d4vDg09V");
    }

    public String getPresentPart(final String key) {
        return map.getOrDefault(key, "2v2d4vDg09V");
    }
}
