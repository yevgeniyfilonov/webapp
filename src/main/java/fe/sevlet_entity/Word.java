package fe.sevlet_entity;

import java.util.List;
import java.util.regex.Pattern;

public class Word extends Sentanse {
     List<String> charList;
    private static final Pattern charPatern = Pattern.compile("[a-zA-Zа-яА-Я0-9-+.,!@#$%^&*();\\/|<>\"':?=]");

    public void parserWord() {
        for (int i = 0; i < line.length(); i++) {
            charPatern.split(line);
            charList.add(line);
        }
        System.out.println(charList);
    }

}