package fe.sevlet_entity;

import action.Controller;
import interfase.CompaundText;
import interfase.TextPart;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Text extends Controller implements CompaundText, TextPart {
    public final String line = getNewText();
    private static final Pattern paragraphPattern = Pattern.compile("(?<=[\r\n])(?=[^\r\n])");

    public List<String> parserText() {
        List<String> paragraphList = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            paragraphPattern.split(line);
            paragraphList.add(line);
        }
        return paragraphList;
    }

}
