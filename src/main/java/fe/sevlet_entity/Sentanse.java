package fe.sevlet_entity;

import java.util.List;

public class Sentanse extends Paragraph {
    String sLine = getNewText();
    List<String> sList;

    public String parserSentanse() {
        for (int i = 0; i < sLine.length(); i++) {
            sLine.split("/ ");
            sList.add(sLine);
        }
        return sLine;
    }
}