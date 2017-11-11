package Lessons;

import MenuBuilder.MenuEntry;

/***
 * Build item has an entry, and it has
 */
public class BuildItem {
    MenuEntry entry  = new MenuEntry();

    //contructor
    public BuildItem(){}
    public BuildItem(MenuEntry entry) {
        setEntry(entry.getTitle(),entry.getDesc(), entry.getExample());
    }

    public BuildItem getBuildItem(){
        return this;
    }

    public MenuEntry getEntry() {
        return entry;
    }

    public void setEntry(String title, String desc, String example){
        entry.setTitle(title)
                .setDesc(desc)
                .setExample(example);
    }
    public void runExample(boolean showMenu){}
    public void printIt (String print) {
        System.out.println(print);
    }

}
