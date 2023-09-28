package Seminar1homework;

import java.util.ArrayList;

public class Program {

        public static void main(String[] args) {

        // Product product1 = new Product("ООО Источник", "_", -100);
        // //product1.brand = "ООО Источник";
        // //product1.name = "_";
        // //product1.price = -100;
        // product1.setName("43");
        // System.out.println(product1.displayInfo());


        // Product product2 = new Product();
        // System.out.println(product2.displayInfo());


        // Product product3 = new Product("Бутылка с водой (3)", 50);
        // System.out.println(product3.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
        // System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);
        // System.out.println(bottleOfWater1.displayInfo());


        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 110, 1, 15);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 170, 3, 35);

        Product cips1 = new Cips("ООО Лэйз", "Чипсы Lays", 150, "Бекон", 200);
        Product cips2 = new Cips("ООО Лэйз", "Чипсы Lays", 150, "Лук", 200);
        Product cips3 = new Cips("ООО Лэйз", "Чипсы Lays", 150, "Сметана", 200);
        Product cips4 = new Cips("ООО Лэйз", "Чипсы Lays", 280, "Бекон", 400);
        Product cips5 = new Cips("ООО Лэйз", "Чипсы Lays", 280, "Лук", 400);
        Product cips6 = new Cips("ООО Лэйз", "Чипсы Lays", 280, "Сметана", 400);
        Product cips7 = new Cips("ООО Принглес", "Чипсы Pringles", 255, "Бекон", 50);
        Product cips8 = new Cips("ООО Принглес", "Чипсы Pringles", 255, "Шашлыка", 50);
        Product cips9 = new Cips("ООО Принглес", "Чипсы Pringles", 410, "Бекон", 160);
        Product cips10 = new Cips("ООО Принглес", "Чипсы Pringles", 410, "Шашлыка", 160);
        // System.out.println(cips1.displayInfo());


        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfWater1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);
        arrayList.add(cips1);
        arrayList.add(cips2);
        arrayList.add(cips3);
        arrayList.add(cips4);
        arrayList.add(cips5);
        arrayList.add(cips6);
        arrayList.add(cips7);
        arrayList.add(cips8);
        arrayList.add(cips9);
        arrayList.add(cips10);


        VendingMachine vendingMachine = new VendingMachine(arrayList);

        // BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (3)", 2);
        // if (bottleOfMilk != null){
        //     System.out.println("Вы купили:");
        //     System.out.println(bottleOfMilk.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с молоком нет в автомате.");
        // }

        Cips cips = vendingMachine.getCips("Чипсы Pringles", "Шашлыка", 160);
        if (cips != null) {
            System.out.println();
            System.out.println("Возьмите ваши чипсы:");
            System.out.println(cips.displayInfo());
            System.out.println();
        } else {
            System.out.println();
            System.out.printf("Извините, таких чипсов нет");
            System.out.println();
        }

    }

}
