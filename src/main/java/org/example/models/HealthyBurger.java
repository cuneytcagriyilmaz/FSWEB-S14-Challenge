package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }


//    @Override
//    public double itemizeHamburger() {
//
//        System.out.println("***************");
//        System.out.println(super.itemizeHamburger());
//        System.out.println("***************");
//        double totalPrice = super.itemizeHamburger();
//
//
//
//        if (this.healthyExtra1Name != null) {
//            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
//            totalPrice += this.healthyExtra1Price;
//        }
//        if (this.healthyExtra2Name != null) {
//            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
//            totalPrice += this.healthyExtra2Price;
//        }
//        System.out.println("Price: " + totalPrice);
//        return totalPrice;
//    }


    @Override
    public double itemizeHamburger() {
        double totalPrice = super.getPrice();

        System.out.println("Name: " + super.getName() + "\nMeat : " + super.getMeat() + "\nBreadRollType: " + super.getBreadRollType());
        String[] additions = {super.getAddition1Name(), super.getAddition2Name(), super.getAddition3Name(), super.getAddition4Name()};
        double[] additionPrices = {super.getAddition1Price(), super.getAddition2Price(), super.getAddition3Price(), super.getAddition4Price()};

        for (int i = 0; i < additions.length; i++) {
            if (additions[i] != null) {
                System.out.println("Addition" + (i + 1) + ": " + additions[i]);
                totalPrice += additionPrices[i];
            }
        }

        if (this.healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
            totalPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
            totalPrice += this.healthyExtra2Price;
        }
        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }
}

