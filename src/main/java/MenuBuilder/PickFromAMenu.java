package MenuBuilder;

public class PickFromAMenu {

    public PickFromAMenu(MenuBuilder menu) {
        printMenu();

    }


    public void passInSelection(int selection) {
        printIt("selected");
    }

    public void printMenu() {
        printIt("this is the menu");
    }

    private void printIt(String msg) {
        System.out.println(msg);
    }
}
