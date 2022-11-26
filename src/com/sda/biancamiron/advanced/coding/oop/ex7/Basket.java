package com.sda.biancamiron.advanced.coding.oop.ex7;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a Basket class that imitates a basket and stores the current number of items in the basket.
 * Add the addToBasket() method, which adds the element to the basket (increasing the current state by 1)
 * and the removeFromBasket() method, which removes the element from the basket (reducing the current state by 1).
 * The basket can store from 0 to 10 items.
 * When a user wants to remove an element at 0 items state or add an element at 10 items state,
 * throw the appropriate runtime exception (BasketFullException or BasketEmptyException).
 *
 * New
 * Change the BasketFullException and
 * BasketEmptyException exceptions from runtime exception type to checked exception type. Handle them.
 */

public class Basket {
    private List<String> products =new ArrayList<>();

    private final int maxSize;


    public Basket(int maxSize) {
        this.maxSize = maxSize;
    }
    public void addToBasket(String product) throws BasketFullException{
        if(products.size()<maxSize){
            products.add(product);
        }else{
            throw new BasketFullException("Basket is full : " +maxSize);
        }
    }
    public void removeFromBasket(String product) throws BasketEmptyException{
        if(!product.isEmpty()){
            products.remove(product);
        }else{
            throw new BasketEmptyException("Basket is empty ");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                ", maxSize=" + maxSize +
                '}';
    }
}
