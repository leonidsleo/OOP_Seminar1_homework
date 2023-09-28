package Seminar1homework;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }

    public Cips getCips(String name, String taste, double weight) {
        for (Product product : products) {
            if (product instanceof Cips) {
                Cips cips = (Cips)product;
                if (cips.getName().equals(name) && cips.getTaste() == taste && cips.getWeght() == weight)
                return cips;
            }
        }
        return null;
    }

}
