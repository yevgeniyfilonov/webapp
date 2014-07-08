package fe.sevlet_entity;


import java.util.List;

public class Paragraph extends Text {
    String pLine = getNewText();
    List<String> pList;

    public String parserParagraph() {
        for (int i = 0; i < pLine.length(); i++) {
            pLine.split("/.");
            pList.add(pLine);
        }
        return pLine;
    }
}
