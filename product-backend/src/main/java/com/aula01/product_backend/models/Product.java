package com.aula01.product_backend.models;

public class Product {
    
    // Atributos
    private int id;
    private String name;
    private String description;
    private int idCategory;
    private Boolean promotion;
    private Boolean newProduct;
    
    //Metodos Constrturores
    public Product(int id, String name, String description, int idCategory, Boolean promotion, Boolean newProduct, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.idCategory = idCategory;
        this.promotion = promotion;
        this.newProduct = newProduct;
        this.price = price;
    }
    public Product(){
        
    }


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



    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public int getIdCategory() {
        return idCategory;
    }



    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }



    public Boolean getPromotion() {
        return promotion;
    }



    public void setPromotion(Boolean promotion) {
        this.promotion = promotion;
    }



    public Boolean getNewProduct() {
        return newProduct;
    }



    public void setNewProduct(Boolean newProduct) {
        this.newProduct = newProduct;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    private double price;

    

    

    

    

    
    
    
}
