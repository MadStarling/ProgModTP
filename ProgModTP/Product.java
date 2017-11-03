package ProgModTP;

class Product{
    private int productId;
    private String productName;
    private String productDescription;
    private double price;
   
    public Product() throws Exception{
    	throw new Exception("Cannot create empty product.");
    }

    public Product(int productId, String productName, String productDescription, double price){
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
   	}

    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public String getProductDescription(){
        return productDescription;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}