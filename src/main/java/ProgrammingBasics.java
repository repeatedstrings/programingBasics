import Lessons.BuildFancyIfItem;
import Lessons.BuildIfItem;
import Lessons.BuildItem;
import MenuBuilder.*;

import java.util.Scanner;

public class ProgrammingBasics {


    public static void main(String args[]) {
        MenuBuilder myMenu = new MenuBuilder();

//        list of learned lessons

        myMenu.addMenuItem(new BuildIfItem())
                .addMenuItem(new BuildFancyIfItem());


        //print out menu and then select one to show.
        myMenu.printMenu();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your selection: ");
        int selected = keyboard.nextInt();

        BuildItem item = myMenu.getMenuEntry(selected);
        item.getBuildItem().runExample(true);

    }

}
