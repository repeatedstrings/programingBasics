
import Lessons.BuildIfItem;
import MenuBuilder.MenuBuilder;

public class ProgrammingBasics {


    public static void main(String args[]) {
        MenuBuilder myMenu = new MenuBuilder();

//        list of learned lessons
        BuildIfItem ifItem = new BuildIfItem();
        myMenu.addMenuItem(ifItem.getIfEntry());
        ifItem.runExample(true);



//        myMenu.addMenuItem(new BuildFancyIfItem().getFancyIfEntry());
//        int selection = mymenu.selectitemfrommenu();
//        myMenu.printMenu();
//        System.out.println(myMenu.toString());

    }

}
