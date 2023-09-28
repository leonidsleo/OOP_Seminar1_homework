package Seminar1homework;

public class Cips extends Product {

    private String taste; //вкус

    private double weight; // вес, можно указать в кг или гр. Для кг возможо 0,3 кг.

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getWeght() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }    

    public Cips(String brand, String name, double price, String taste, double weight) {

        super(brand, name, price);
        this.taste = taste;
        this.weight = weight;
    }

    @Override
    public String displayInfo(){
        return String.format("Производитель: %s - Продукт: %s - Стоимость: %.2f - Вкус: %s - Вес: %.2f грамм", brand, name, price, taste, weight);
    }
}
