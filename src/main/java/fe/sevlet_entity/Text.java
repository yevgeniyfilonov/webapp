package fe.sevlet_entity;

import fe.action.Controller;

import java.util.regex.Pattern;

public class Text extends Controller {
    private static final Pattern paragraphPattern = Pattern.compile("(?<=[\r\n])(?=[^\r\n])");

       public Text() {

    }

    /*public List<String> parserText() {
        List<String> paragraphList = new ArrayList<>();
        for (int i = 0; i < .length(); i++) {
            paragraphPattern.split(line);
            paragraphList.add(line);
        }
        return paragraphList;
    }*/

}
