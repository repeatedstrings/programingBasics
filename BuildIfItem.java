package Lessons;
import MenuBuilder.*;

import java.util.Random;
import java.util.Scanner;

public class BuildIfItem implements EntryInterface {
    /**
     *
     * The if conditional
     * The if conditional is a useful check of a binary state.
     * If this, do this thing, if not, do that thing.
     * This can be combined in several checks...
     * If you are doing too many though, you may want to think about using
     * a case instead.
     *
     * if(isTrue) {
     *     // do this
     * } else {
     *    // do that instead
     * }
     *
     */


    MenuEntry entry = new MenuEntry();
    String title = "The if conditional";
    String desc = "The if conditional is a useful check of a binary state. " +
            "If this, do this thing, if not, do that thing." +
            "This can be combined in several checks... " +
            "If you are doing too many though, you may want to think about using" +
            "a case instead.";
    String examp = "boolean isTrue = false;\n"+
            "if(isTrue) {\n"+
            "   //do the true thing;\n"+
            "} else {\n"+
            "   //do the false thing\n"+
            "}\n";

    public MenuEntry getIfEntry() {
        entry.setDesc(desc).setTitle(title).setExample(examp).setSection(SectionType.CONDITIONALS);
        return entry;
    }

    @Override
    public void printIt (String print) {
        System.out.println(print);
    }

    @Override
    public void runExample(boolean printLesson){
        if (printLesson) {
            printIt(entry.toString());
        }
        int topNum = 5;
        int lowNum = 1;
        printIt("You get to guess a number from "+lowNum+" to "+topNum);
        int randomNum =  getRandNumber(lowNum, topNum);
        printIt("> ");
        Scanner keyboard = new Scanner(System.in);
        int myInt = keyboard.nextInt();
        if(myInt < randomNum) {
            printIt("your guess was too low! I picked "+ randomNum+ " HA HA!");
        } else if (myInt > randomNum){
            printIt("your guess was too high! I picked "+randomNum +" HA HA!");
        } else {
            printIt("fooy, you got it!");
        }



    }
    public int getRandNumber(int fromNum, int toNum){
        Random r = new Random();
        return r.nextInt(toNum-fromNum) + fromNum;
    }
}
