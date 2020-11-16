import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;


    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            CustomIterator customIterator = menu.createIterator();
            printMenu(customIterator);
            System.out.println("");
        }
    }

    public void printMenuForVegetarian() {
        for (Menu menu : menus) {
            CustomIterator customIterator = menu.createIterator();
            printMenuForVegeterians(customIterator);
            System.out.println("");
        }
    }

    public void printMenu(Menu menu) {
        CustomIterator customIterator = menu.createIterator();
        printMenu(customIterator);
        System.out.println("");
    }

    public void printMenuForVegeterians(CustomIterator customIterator) {
        while (customIterator.hasNext()) {
            MenuItem menuItem = customIterator.next();
            if (menuItem.vegetarian) {
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }
    }

    void printMenu(CustomIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
