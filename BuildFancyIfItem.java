package Lessons;

import MenuBuilder.MenuEntry;
import MenuBuilder.SectionType;

public class BuildFancyIfItem implements EntryInterface{

    MenuEntry entry = new MenuEntry();
    String title = "The fancy if conditional, ternary!";
    String desc = "The if conditional is the same as an if check, it's just prettier." +
            "It's called ternary operator. " +
            "If this, do this thing, if not, do that thing." +
            "This can be combined in several checks... " +
            "If you are doing too many though, you may want to think about using" +
            "a case instead.";
    String examp = "result = testCondition ? value1 : value2s";

    public MenuEntry getFancyIfEntry() {
        entry.setDesc(desc).setTitle(title).setExample(examp).setSection(SectionType.CONDITIONALS);
        return entry;
    }

    @Override
    public void runExample(boolean printLesson) {
        if (printLesson){
            printIt(entry.toString());
        }


    }
    @Override
    public void printIt(String print) {
        System.out.println(print);
    }
}
