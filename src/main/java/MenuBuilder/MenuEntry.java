package MenuBuilder;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class MenuEntry {
    private String title;
    private SectionType section;
    private String desc;
    private String example;


    public MenuEntry(String title, SectionType section,String desc, String example) {
        setTitle(title);
        setSection(section);
        setDesc(desc);
        setExample(example);

    }

    public MenuEntry() { }

    public String getTitle() {
        return title;
    }
    public MenuEntry setTitle(String title) {
        this.title = title;
        return this;
    }

    public SectionType getSection() { return section; }
    public MenuEntry setSection(SectionType section) {
        this.section = section;
        return this;
    }

    public String getDesc() {
        return desc;
    }
    public MenuEntry setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getExample() {
        return example;
    }

    public MenuEntry setExample(String example) {
        this.example = example;
        return this;
    }

    @Override
    public String toString() {
        String returnString = getTitle() + "\n \n" + getExample() + "\n\n";
        Scanner scanner = new Scanner(returnString);
        return printBox(scanner, 50, getDesc());

    }


    private String printBox(Scanner in, int length, String desc) {
        String s;
        String outString = " ";
        for (int i = 0; i <= length + 1; i++) {
            outString += "_";
        }
        outString += "\n";
        while (in.hasNext()) {
            s = in.nextLine();
            // check max characters, then add newline after at previous space
            s = chopIntoPieces(s, length);
            outString += "| " + s + StringUtils.repeat(" ", length - s.length()) + " |\n";
        }
        String newString = "|";
        for (int j = 0; j <= length + 1; j++) {
            newString += "_";
        }

        newString += "|";
        outString += newString + "\n";

        outString += "\n" + chopIntoPieces(desc, length)+"\n";
        return outString;
    }

    public String chopIntoPieces(String s, int length) {
        if (s.length() > length) {
            StringBuilder sb = new StringBuilder(s);
            int i = 0;
            while ((i = sb.indexOf(" ", i + length)) != -1) {
                sb.replace(i, i + 1, "\n");
            }
            s = sb.toString();
        }
        return s;
    }
}