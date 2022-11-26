package com.sda.biancamiron.advanced.coding.oop.ex7;


public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(5);
        try {
            basket.addToBasket("Eggs");
            basket.addToBasket("Eggs");
            basket.addToBasket("Eggs");
            basket.addToBasket("Eggs");
            basket.addToBasket("Eggs");
            basket.addToBasket("Eggs");
        }catch (BasketFullException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println();
        }
    }
}
