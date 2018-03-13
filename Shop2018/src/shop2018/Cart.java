package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import shop2018.Product;


public class Cart {
    //private List<Produkt> lista = new ArrayList();
    private Map<Product,Integer> map=new HashMap();
    public void add(Product p)
    {
        if(map.containsKey(p))
        {
            int i=map.get(p);
            i++;
            map.put(p, i);
          
        }
        else
        {
            
        map.put(p,1);
    }}
    
    public BigDecimal toPay()
    {
        BigDecimal sum = new BigDecimal(0);
        for(Product p : map.keySet())
        {
            int ilosc=map.get(p);
            sum=sum.
                    add(p.getPrice()
                    .multiply(new BigDecimal(ilosc)));
            
        }
        return sum;
    }
    public String toString()
    {
        return map.toString()+"Razem do Zapłaty:"+toPay();
    }
    
    
}