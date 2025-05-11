/**
 * BabyCottonClub
 * Product.java
 * Author : Thapelo Ngwenya - 222260971
 * Date : 11 May 2025
 */
package za.ac.cput.domain;

public class Product {
    private String productId;
    private String productName;
    private String color;
    private short price;
    private String inStock;

    private Product(){
    }



private Product(Builder builder) {
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.color = builder.color;
        this.price = builder.price;
        this.inStock = builder.inStock;

}

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getColor() {
        return color;
    }

    public short getPrice() {
        return price;
    }

    public String getInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", inStock='" + inStock + '\'' +
                '}';
    }
    public static class Builder {
        private String productId;
        private String productName;
        private String color;
        private short price;
        private String inStock;


        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setPrice(short price) {
            this.price = price;
            return this;
        }

        public Builder setInStock(String inStock) {
            this.inStock = inStock;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "productId='" + productId + '\'' +
                    ", productName='" + productName + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", inStock='" + inStock + '\'' +
                    '}';
        }
        public Builder copy(Product product) {
            this.productId = product.getProductId();
            this.productName = product.getProductName();
            this.color = product.getColor();
            this.price = product.getPrice();
            this.inStock = product.getInStock();
            return this;
        }
        public Product build() {
            return new Product(this);
        }
    }
}
