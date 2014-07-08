package fe.sevlet_entity;

import util.Controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text extends Controller {
    String line = getNewText();
    List<String> list;

    public String parserText() {
        for (int i = 0; i < line.length(); i++) {
            line.split("/t/n");
            list.add(line);
        }
        return line;
    }
}

/*Pattern r = Pattern.compile("[a-zA-Z]+");
*Matcher m = r.matcher(sLine);
list.add(m.toString());*/