package shop2018;

import java.math.BigDecimal;

public class Product  implements Comparable<Product>{
    private String name;
    private BigDecimal price;
    private int count = 100;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
    @Override
    public String toString()
    {
        return name +"("+price+"zł, "+count+"szt.)";
    }
    public int getCount() {
        return count;
    }
    public void setCount (int count){
        this.count = count;
    }
    @Override
    public int compareTo(Product second) {
        return name.compareTo(second.name);
    }
    
    
    
}