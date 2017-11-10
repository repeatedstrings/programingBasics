package MenuBuilder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuBuilder {
    public ArrayList<MenuEntry> menu = new ArrayList<>();

    public MenuBuilder() {
    }

    public void addMenuItem(MenuEntry item) {
        menu.add(item);
    }

    public void printMenu() {
        System.out.println(SectionType.CONDITIONALS);
        Iterator iter = menu.iterator();
        for (int i = 0; i < menu.size(); i++) {
            if (SectionType.CONDITIONALS == menu.get(i).getSection()) {
                System.out.println("    "+i+"   "+menu.get(i).getTitle());
            }
        }
    }
    public int selectItemFromMenu(){
        printMenu();
        Scanner keyboard = new Scanner(System.in);
        int myInt = keyboard.nextInt();
        if(myInt <= menu.size()) {
            print(menu.get(myInt).toString());
        }
        return myInt;
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
