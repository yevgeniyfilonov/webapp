package fe.sevlet_entity;

import action.Controller;
import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Text extends Controller {
     public final String line = getNewText();
     public List<String> paragraphList = new ArrayList<>();
    private static final Pattern paragraphPattern = Pattern.compile("/t/n");

    public void parserText() {
        for (int i = 0; i < line.length(); i++) {
            paragraphPattern.split(line);
            paragraphList.add(line);
        }
    }

    public  void main(String[] args) {
        System.out.println(paragraphList.toString());
    }
}
