package fe.sevlet_entity;

import java.util.regex.Pattern;

public class Word extends Sentance {
    private static final Pattern charPatern = Pattern.compile("[a-zA-Zа-яА-Я0-9-+.,!@#$%^&*();\\/|<>\"':?=]");


    public Word(String string) {
        super(string);
    }
}