package fe.sevlet_entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Sentanse extends Paragraph {
    public static final Pattern wordPattern = Pattern.compile("[ \\t\\n\\x0B\\f\\r]");

    public List<String> parserSentanse() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            wordPattern.split(line);
            charList.add(line);
        }
        return charList;
    }
}