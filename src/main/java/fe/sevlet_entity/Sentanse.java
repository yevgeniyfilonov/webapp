package fe.sevlet_entity;

import java.util.List;
import java.util.regex.Pattern;

public class Sentanse extends Paragraph {
    List<String> charList;
    public static final Pattern wordPattern = Pattern.compile("/ ");

    public void parserSentanse() {
        for (int i = 0; i < line.length(); i++) {
            wordPattern.split(line);
            charList.add(line);
        }
    }
}