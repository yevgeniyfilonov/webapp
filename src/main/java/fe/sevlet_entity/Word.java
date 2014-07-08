package fe.sevlet_entity;

import java.util.List;

public class Word extends Sentanse {
    String wLine = getNewText();
    List<String> wList;

    public String parserWord() {
        for (int i = 0; i < wLine.length(); i++) {
            wLine.split("[a-zA-Zа-яА-Я0-9-+.,!@#$%^&*();\\/|<>\"':?=]");
            wList.add(wLine);
        }
        return wLine;

    }

}