package fe.sevlet_entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Sentance extends Paragraph {
    public static final Pattern wordPattern = Pattern.compile("[ \\t\\n\\x0B\\f\\r]");


    public Sentance(String string) {
        super(string);
    }
}