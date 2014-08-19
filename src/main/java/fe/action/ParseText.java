package fe.action;

import fe.sevlet_entity.Paragraph;
import fe.sevlet_entity.Text;

import java.util.ArrayList;
import java.util.List;

public class ParseText extends Text {
    public ParseText(String text) {
        super();
    }

    public static List<Paragraph> parseParagraph(String text) {
        List<Paragraph> paragraphs = new ArrayList<>();
        String[] strings = text.split("(?<=[\r\n])(?=[^\r\n])");
        for (String string : strings) {
            paragraphs.add(new Paragraph(string));
        }
        return paragraphs;
    }
}
