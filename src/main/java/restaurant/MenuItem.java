package restaurant;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private Boolean isNew;

    private String date;

    public MenuItem(double price, String description, String category, Boolean isNew, String date){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static void main (String[] args) {
        System.out.println("test");
    }
}
