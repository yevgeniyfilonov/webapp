package fe.sevlet_entity;

import util.Controller;

import java.util.List;
import java.util.regex.Pattern;

public class Text extends Controller {
     public final String line = getNewText();
     List<String> paragraphList;
    private static final Pattern paragraphPattern = Pattern.compile("/t/n");

    public void parserText() {
        for (int i = 0; i < line.length(); i++) {
            paragraphPattern.split(line);
            paragraphList.add(line);
        }
    }
}
