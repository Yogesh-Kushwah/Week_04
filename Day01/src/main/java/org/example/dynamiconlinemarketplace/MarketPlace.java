package org.example.dynamiconlinemarketplace;

// Class representing books in the marketplace
class BookCategory {
    double bookPrice;
    String authorName;
    String bookTitle;

    public BookCategory(double bookPrice, String authorName, String bookTitle) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
    }
}

// Class representing clothing items in the marketplace
class ClothingCategory {
    String clothName;
    double clothPrice;
    String clothFabric;

    public ClothingCategory(String clothName, double clothPrice, String clothFabric) {
        this.clothName = clothName;
        this.clothPrice = clothPrice;
        this.clothFabric = clothFabric;
    }
}

// Generic class for products
class Product<T> {
    String name;
    double price;
    T category; // Category-specific details

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Category: " + category.getClass().getSimpleName();
    }
}

public class MarketPlace {

    // Generic method to apply a discount on a product
    public <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = (product.price * percentage) / 100;
        System.out.println("Discount: " + discount);
    }

    public static void main(String[] args) {
        // Create a book product
        Product<BookCategory> book = new Product<>(
                "Jurassic Park",
                550.0,
                new BookCategory(500.0, "The Rock", "Jurassic Park")
        );

        // Create a clothing product
        Product<ClothingCategory> cloth = new Product<>(
                "Jacket",
                50.0,
                new ClothingCategory("Sweatshirt", 250, "Cotton")
        );

        // Print product details
        System.out.println(book);
        System.out.println(cloth);

        // Apply a discount to the book product
        MarketPlace marketplace = new MarketPlace();
        marketplace.applyDiscount(book, 60);
    }
}
