package org.example.shopping_cart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Adding products
        cart.addProduct("Laptop", 1500.00);
        cart.addProduct("Phone", 800.00);
        cart.addProduct("Tablet", 500.00);
        
        // Adding items to cart
        cart.addItemToCart("Laptop", 1);
        cart.addItemToCart("Phone", 2);
        cart.addItemToCart("Tablet", 1);
        
        // Display items in order added
        cart.displayCartInOrder();
        
        // Display items sorted by price
        cart.displayCartSortedByPrice();
    }
}
