package restaurant;


import java.time.LocalDateTime;

public class Menu {
    static String trackDate;
    public static String getDate (){
        LocalDateTime date = LocalDateTime.now();
        trackDate = date.toString();
        return date.toString();
    }

    public static void main (String[] args) {
        String[] categories = {"appetizer", "main", "course", "dessert"};

        MenuItem burger = new MenuItem(8.99,
                "double cheeeseburger", categories[1], false, getDate());
        MenuItem fries = new MenuItem(4.99, "crispy fries", categories[0], true, getDate());

        System.out.println("App was last updated on: "+ trackDate);
    }


}
