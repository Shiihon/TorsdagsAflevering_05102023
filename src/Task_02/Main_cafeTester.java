package Task_02;

public class Main_cafeTester {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        for (String menuItem : cafe.coffeeMenu) {
            System.out.println(menuItem);
        }
    }
}
