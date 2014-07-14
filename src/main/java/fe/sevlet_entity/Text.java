package fe.sevlet_entity;

import action.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Text extends Controller {
    private static final Pattern paragraphPattern = Pattern.compile("(?<=[\r\n])(?=[^\r\n])");
    public final String line = getNewText();

    public List<String> parserText() {
        List<String> paragraphList = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            paragraphPattern.split(line);
            paragraphList.add(line);
        }
        return paragraphList;
    }

}
