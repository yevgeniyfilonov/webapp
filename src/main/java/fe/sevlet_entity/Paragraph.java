package fe.sevlet_entity;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Paragraph extends Text {
    public static final Pattern sentansePattern = Pattern.compile("(?=[.][ \\t\\n\\x0B\\f\\r])");


    public Paragraph(String string) {

    }
}
