package com.example.day17.exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Num5 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Smartphone", "Electronics", 700.00),
                new Product("Desk", "Furniture", 300.00),
                new Product("Chair", "Furniture", 150.00)
        );
        Map<String, List<Product>> groupDepartment =  products.stream().collect(Collectors.groupingBy(Product::getCategory));
        double result1 = groupDepartment.get("Electronics").stream().mapToDouble(p -> p.getPrice()).average().orElse(-1);
        double result2 = groupDepartment.get("Furniture").stream().mapToDouble(p -> p.getPrice()).average().orElse(-1);

        System.out.println(result1);
        System.out.println(result2);
    }
}
class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}