
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
public class Warehouse {

    private List <Product> products=new ArrayList();

    public Warehouse()
{
products.add (new Product("chleb",new BigDecimal("2.2")));
products.add (new Product("maslo",new BigDecimal("6.12")));
products.add (new Product("mleko", new BigDecimal("1.9")));
products.add (new Product("jogurt", new BigDecimal("0.95")));
products.add (new Product("śmietana", new BigDecimal("1.5")));

}
    public Collection<Product> productsAvailable()
    {
        return null;  /*sprawdzic które produkty sa dostepne*/
    }
public Collection<Product> productSortedByName()
{
TreeSet set = new TreeSet();
set.addAll((Collection) products);
return set;
}
public Collection<Product> productsSortedByPrice()
{
    PriceComparator c = new PriceComparator ();
    TreeSet<Product> set = new TreeSet(c);
    set.addAll(products);
    return set;

}
public void doOrder (Cart cart)
{
    
}


@Override
public String toString(){
return products.toString();
}
public static void main(String[] args){
    Warehouse w = new Warehouse();
    System.out.println(w);
    System.out.println(w.productSortedByName());
    System.out.println(w.productsSortedByPrice());
    
}
}