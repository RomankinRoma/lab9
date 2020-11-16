import java.util.ArrayList;
import java.util.Scanner;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        Scanner in=new Scanner(System.in);
        while (true){
            System.out.println("1.Pancake menu");
            System.out.println("2.Diner menu");
            System.out.println("3.All menu");
            System.out.println("4.Vegetarian menu");
            System.out.println("0.Exit");
            int chose=in.nextInt();

            switch (chose){
                case 1:
                    System.out.println("Pancake menu:");
                    waitress.printMenu(pancakeHouseMenu);
                    break;
                case 2:
                    System.out.println("Diner menu:");
                    waitress.printMenu(dinerMenu);
                    break;
                case 3:
                    System.out.println("All menu:");
                    waitress.printMenu();
                    break;

                case 4:
                    System.out.println("Vegetarian menu:");
                    waitress.printMenuForVegetarian();
                    break;

                case 0:
                    System.out.println("BYE!THANK YOU!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry. We dont have this operation.");
                    break;
            }
        }
    }
}
