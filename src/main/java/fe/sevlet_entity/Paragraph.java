package fe.sevlet_entity;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Paragraph extends Text {
    public static final Pattern sentansePattern = Pattern.compile("(?=[.][ \\t\\n\\x0B\\f\\r])");

    public List<String> parserParagraph() {
        List<String> sentanseList = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            sentansePattern.split(line);
            sentanseList.add(line);
        }
        return sentanseList;
    }
}
