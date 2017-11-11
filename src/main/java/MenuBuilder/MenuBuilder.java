package MenuBuilder;

import Lessons.BuildItem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuBuilder {
    public ArrayList<BuildItem> menu = new ArrayList<>();

    public MenuBuilder() {
    }

    public MenuBuilder addMenuItem(BuildItem item) {
        menu.add(item);
        return this;
    }

    public BuildItem getMenuEntry(int selection) {
        return menu.get(selection);
    }


    public void printMenu() {
        System.out.println(SectionType.CONDITIONALS);
        Iterator iter = menu.iterator();
        for (int i = 0; i < menu.size(); i++) {
            if (SectionType.CONDITIONALS == menu.get(i).getEntry().getSection()) {
                System.out.println("    "+i+"   "+menu.get(i).getEntry().getTitle());
            }
        }
    }
    public void selectItemFromMenu(){
        printMenu();
        Scanner keyboard = new Scanner(System.in);
        int myInt = keyboard.nextInt();
        if(myInt <= menu.size()) {
            print(menu.get(myInt).toString());
        }

    }


    @Override
    public String toString() {
        String entryList = "";
        for (Object menuItem : menu) {
            entryList += menuItem.toString();
        }
        return entryList;
    }

    private void print(String itemToPrint) {
        System.out.println(itemToPrint);
    }
}
