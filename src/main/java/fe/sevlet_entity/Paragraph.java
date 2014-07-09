package fe.sevlet_entity;


import java.util.List;
import java.util.regex.Pattern;

public class Paragraph extends Text {
    List<String> sentanseList;
    public static final Pattern sentansePattern = Pattern.compile("/.");

    public void parserParagraph() {
        for (int i = 0; i < line.length(); i++) {
            sentansePattern.split(line);
            sentanseList.add(line);
        }
    }
}
