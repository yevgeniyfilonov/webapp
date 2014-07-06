package fe.sevlet_entity;

import util.Controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text extends Controller {
    public String parserText() {
        // String to be scanned to find the pattern.
        String line = getNewText();
        List<String> list = null;
        for (int i = 0; i < line.length(); i++) {
            Pattern r = Pattern.compile("[a-zA-Z]+");
            // Now create matcher object.
            Matcher m = r.matcher(line);
            list.add(m.toString());
        }
        return line;
    }
}