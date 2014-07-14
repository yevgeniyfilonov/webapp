package fe.sevlet_entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Word extends Sentanse {
    private static final Pattern charPatern = Pattern.compile("[a-zA-Zа-яА-Я0-9-+.,!@#$%^&*();\\/|<>\"':?=]");

    public List<String> parserWord() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            charPatern.split(line);
            charList.add(line);
        }
        return charList;
    }

}