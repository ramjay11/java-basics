package com.ramjava.java.basique.streams.auxquelles_repondre;

import java.util.ArrayList;
import java.util.List;

public class QuestionsAuxquellesRepondre {
    /* 1. What is Stream?
      Introduced in Java 8, the Stream API is used to process collections of objects. A Stream is a sequence of objects that supports various methods
      which can be pipelined to produce the desired results
    * */

    /* 2. Explain Stream Operations
      Intermediate Operations - transform a stream into another stream, such as filtering, sorting, element transformation (mapping)
    * */
    private List<Product> productList;

    public QuestionsAuxquellesRepondre() {
        initializeProductList();
    }

    private void initializeProductList() {
        productList = new ArrayList<>() {
            // Initialization block
            {
                // Adding Products
                add(new Product(1, "HP Laptop", 27000f));
                add(new Product(1, "Dell Laptop", 30000f));
                add(new Product(1, "Lenovo Laptop", 28000f));
            }
        };
    }
    // Method to print product details
    public void printProductDetails() {
        productList.stream()
                .filter(product -> product.getPrice() == 30000f)
                .forEach(product -> System.out.println(product.getPrice()));
}

//    List<Product> productList = new ArrayList<Product>() {
//        // Initialization block
//        {
//            // Adding Products
//            add(new Product(1, "HP Laptop", 27000f)); // Removed productList. prefix
//            add(new Product(1, "Dell Laptop", 30000f));
//            add(new Product(1, "Lenovo Laptop", 28000f));
//            // This is more compact approach for filtering data
//            productList.stream().filter(product -> product.getPrice() == 3000)
//                    .forEach(product -> System.out.println(product.getPrice()));
//        }
//    };
}

class Product {
    private int id;
    private String name;
    private float price; // Assuming there's also a price attribute

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (optional, but good practice)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

class Main {
    public static void main(String[] args) {
        // Create an instance of QuestionsAuxquellesRepondre
        var questionsAuxquellesRepondre = new QuestionsAuxquellesRepondre();
        questionsAuxquellesRepondre.printProductDetails();
        // Access the productList attribute
        //List<Product> productList = questionsAuxquellesRepondre.productList;
        // Iterate over the productList and print each product's details
//        for (Product product : productList) {
//            System.out.println("ID: " + product.getId());
//            System.out.println("Name: " + product.getName());
//            System.out.println("Price: " + product.getPrice());
//            System.out.println("--------------------");
//        }

    }
}
