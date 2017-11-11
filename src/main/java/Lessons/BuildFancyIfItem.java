package Lessons;

import MenuBuilder.MenuEntry;
import MenuBuilder.SectionType;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BuildFancyIfItem extends BuildItem {

    MenuEntry entry = new MenuEntry();
    String title = "The fancy if conditional, ternary!";

    String desc = "The ternary conditional is the same as an if check, it's just prettier." +
            "If this, do this thing, if not, do that thing." +
            "\nThe point of this is that it returns a variable based on the truthyness of the check  " +
            "\nIt's and awesome, inline quick if check and variable assignment masher.";

    String examp = "Variable result = testCondition ? value1 : value2";

    @Override
    public MenuEntry getEntry() {
        entry.setDesc(desc).setTitle(title).setExample(examp).setSection(SectionType.CONDITIONALS);
        return entry;
    }
    @Override
    public void runExample(boolean showMenu) {
        if (showMenu) {
            printIt(entry.toString());
        }
        Date theDate = new Date();
        SimpleDateFormat cleanItUp = new SimpleDateFormat ("hh");
        int hours = Integer.parseInt(cleanItUp.format(theDate));

        String isItBedtimeYet = hours >= 21 ? "Dude, go to bed" : "Party on Garth!";
        printIt(isItBedtimeYet);
    }
}
